package cmd;

import core.WordCounter;
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

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith( MockitoJUnitRunner.class )
public class WordCountCmdTest
{
    @Mock
    private IoUtils     ioUtilsMock;
    @Mock
    private WordCounter wordCounterMock;

    private WordCountCmd wordCountCmd;

    @Before
    public void setup()
    {
        wordCountCmd = new WordCountCmd();
        wordCountCmd.setIoUtils( ioUtilsMock );
        wordCountCmd.setWordCounter( wordCounterMock );
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
    }
}
