package cmd;

import core.WordCounter;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.Logger;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import picocli.CommandLine;
import util.IoUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith( MockitoJUnitRunner.class )
public class WordCountCmdTest
{
    private final List<LogEvent> capturedEvents = new ArrayList<>();
    @Mock
    private       Appender       mockAppender;
    private       Logger         logger;

    @Mock
    private IoUtils     ioUtilsMock;
    @Mock
    private WordCounter wordCounterMock;

    private WordCountCmd wordCountCmd;

    @Before
    public void setup()
    {
        //Given
        //Custom log Appender to get log messages for Log4j2
        when( mockAppender.getName() ).thenReturn( "MockAppender" );
        when( mockAppender.isStarted() ).thenReturn( true );

        doAnswer( invocation -> {
            LogEvent logEvent = invocation.getArgumentAt( 0, LogEvent.class );
            capturedEvents.add( logEvent.toImmutable() );
            return null;
        } ).when( mockAppender ).append( any() );

        logger = ( Logger ) LogManager.getLogger( WordCountCmd.class );
        logger.addAppender( mockAppender );
        logger.setLevel( Level.ALL );

        wordCountCmd = new WordCountCmd();
        wordCountCmd.setIoUtils( ioUtilsMock );
        wordCountCmd.setWordCounter( wordCounterMock );
    }

    @After
    public void tearDown()
    {
        // the appender we added will sit in the singleton logger forever
        // slowing future things down - so remove it
        logger.removeAppender( mockAppender );
        capturedEvents.clear();
    }

    @Test
    public void fileExistIsRegularFileTest()
        throws IOException
    {
        //Given
        when( ioUtilsMock.doesExist( any( Path.class ) ) ).thenReturn( true );
        when( ioUtilsMock.isRegularFile( any( Path.class ) ) ).thenReturn( true );

        //When
        Path     path = Paths.get( "" );
        String[] args = new String[]{"-f", ""};
        new CommandLine( wordCountCmd ).execute( args );

        //Then
        verify( ioUtilsMock, times( 1 ) ).doesExist( path );
        verify( ioUtilsMock, times( 1 ) ).isRegularFile( path );
        verify( wordCounterMock, times( 1 ) ).readInputStream( any( InputStream.class ) );
        verify( wordCounterMock, times( 1 ) ).printInfo();
    }


    @Test
    public void fileExistIsDirectoryTest()
        throws IOException
    {
        //Given
        when( ioUtilsMock.doesExist( any( Path.class ) ) ).thenReturn( true );
        when( ioUtilsMock.isRegularFile( any( Path.class ) ) ).thenReturn( false ).thenReturn( false );

        //When
        Path     path = Paths.get( "" );
        String[] args = new String[]{"-f", ""};
        new CommandLine( wordCountCmd ).execute( args );

        //Then
        verify( ioUtilsMock, times( 2 ) ).doesExist( path );
        verify( ioUtilsMock, times( 2 ) ).isRegularFile( path );
        verify( wordCounterMock, times( 0 ) ).readInputStream( any( InputStream.class ) );
        verify( wordCounterMock, times( 0 ) ).printInfo();
        Assertions.assertThat( verifyLogMessages( ": is a directory" ) ).isTrue();
    }

    @Test
    public void fileDoesntExistTest()
        throws IOException
    {
        //Given
        when( ioUtilsMock.doesExist( any( Path.class ) ) ).thenReturn( false );
        when( ioUtilsMock.isRegularFile( any( Path.class ) ) ).thenReturn( false ).thenReturn( false );

        //When
        Path     path = Paths.get( "" );
        String[] args = new String[]{"-f", ""};
        new CommandLine( wordCountCmd ).execute( args );

        //Then
        verify( ioUtilsMock, times( 2 ) ).doesExist( path );
        verify( ioUtilsMock, times( 0 ) ).isRegularFile( path );
        verify( wordCounterMock, times( 0 ) ).readInputStream( any( InputStream.class ) );
        verify( wordCounterMock, times( 0 ) ).printInfo();
        Assertions.assertThat( verifyLogMessages( ": does not exist" ) ).isTrue();
    }

    private boolean verifyLogMessages( String... wantedMessages )
    {
        Stream<String> renderedMessageStream = capturedEvents.stream().map( x -> x.getMessage().getFormattedMessage() );
        List<String>   renderedMessages      = renderedMessageStream.collect( Collectors.toList() );

        boolean verified = true;
        for ( String wantedMessage : wantedMessages )
        {
            verified &= renderedMessages.stream().anyMatch( s -> s.contains( wantedMessage ) );
        }

        return verified;
    }
}
