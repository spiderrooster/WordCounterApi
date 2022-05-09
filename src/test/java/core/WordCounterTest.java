package core;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.when;

@RunWith( MockitoJUnitRunner.class )
public class WordCounterTest
{
    @Mock
    private Appender mockAppender;

    private final List<LogEvent> capturedEvents = new ArrayList<>();

    private Logger logger;

    private WordCounter wcts = new WordCounter();

    @Before
    public void setup()
    {
        wcts = new WordCounter();

        //Given
        //Custom log Appender to get log messages for Log4j2
        when( mockAppender.getName() ).thenReturn( "MockAppender" );
        when( mockAppender.isStarted() ).thenReturn( true );

        doAnswer( invocation -> {
            LogEvent logEvent = invocation.getArgumentAt( 0, LogEvent.class );
            capturedEvents.add( logEvent.toImmutable() );
            return null;
        } ).when( mockAppender ).append( any() );

        logger = ( Logger ) LogManager.getLogger( WordCounter.class );
        logger.addAppender( mockAppender );
        logger.setLevel( Level.ALL );
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
    public void synalogikStringTest()
        throws IOException
    {
        //Given
        String      initialString = "Hello world & good morning. The date is 18/05/2016";
        InputStream testStream    = new ByteArrayInputStream( initialString.getBytes() );
        Map<Integer, Integer> map = Stream.of( new Integer[][]{
            {1, 1}, {2, 1}, {3, 1}, {4, 2}, {5, 2}, {7, 1}, {10, 1}
        } ).collect( Collectors.toMap( data -> data[0], data -> data[1] ) );

        //When
        wcts.readInputStream( testStream );
        wcts.printInfo();

        //Then
        assertThat( wcts.getAverage() ).isEqualTo( 4.555555555555555 );
        assertThat( wcts.getWordCount() ).isEqualTo( 9 );
        assertThat( wcts.getLetterCount() ).isEqualTo( 41 );
        assertThat( wcts.getLengthsOfWords() ).isEqualTo( map );
    }


    @Test
    public void tesThreeLargeOneSmallSizeStringTest()
        throws IOException
    {
        //Given
        String      initialString = "testing testing testing small";
        InputStream testStream    = new ByteArrayInputStream( initialString.getBytes() );
        Map<Integer, Integer> map = Stream.of( new Integer[][]{
            {5, 1}, {7, 3}
        } ).collect( Collectors.toMap( data -> data[0], data -> data[1] ) );

        //When
        wcts.readInputStream( testStream );
        wcts.printInfo();

        //Then
        assertThat( wcts.getAverage() ).isEqualTo( 6.5 );
        assertThat( wcts.getWordCount() ).isEqualTo( 4 );
        assertThat( wcts.getLetterCount() ).isEqualTo( 26 );
        assertThat( wcts.getLengthsOfWords() ).isEqualTo( map );
    }

    @Test
    public void allWordsSameSizeStringTest()
        throws IOException
    {
        //Given
        String      initialString = "12345 12345 12345 12345 12345 12345";
        InputStream testStream    = new ByteArrayInputStream( initialString.getBytes() );
        Map<Integer, Integer> map = Stream.of( new Integer[][]{
            {5, 6}
        } ).collect( Collectors.toMap( data -> data[0], data -> data[1] ) );

        //When
        wcts.readInputStream( testStream );
        wcts.printInfo();

        //Then
        assertThat( wcts.getAverage() ).isEqualTo( 5 );
        assertThat( wcts.getWordCount() ).isEqualTo( 6 );
        assertThat( wcts.getLetterCount() ).isEqualTo( 30 );
        assertThat( wcts.getLengthsOfWords() ).isEqualTo( map );
    }

    @Test
    public void allWordsDifferentSizeStringTest()
        throws IOException
    {
        //Given
        String      initialString = "1 12 123 1234 12345 123456";
        InputStream testStream    = new ByteArrayInputStream( initialString.getBytes() );
        Map<Integer, Integer> map = Stream.of( new Integer[][]{
            {1, 1}, {2, 1}, {3, 1}, {4, 1}, {5, 1}, {6, 1}
        } ).collect( Collectors.toMap( data -> data[0], data -> data[1] ) );

        //When
        wcts.readInputStream( testStream );
        wcts.printInfo();

        //Then
        assertThat( wcts.getAverage() ).isEqualTo( 3.5 );
        assertThat( wcts.getWordCount() ).isEqualTo( 6 );
        assertThat( wcts.getLetterCount() ).isEqualTo( 21 );
        assertThat( wcts.getLengthsOfWords() ).isEqualTo( map );
    }

    @Test
    public void bibleTest()
        throws IOException
    {
        //Given
        InputStream testStream = this.getClass()
            .getClassLoader().getResourceAsStream( "test-files/bible_daily.txt" );
        Map<Integer, Integer> map = Stream.of( new Integer[][]{
            {1, 18563}, {2, 126810}, {3, 213311}, {4, 165112}, {5, 102877}, {6, 53903},
            {7, 47726}, {8, 27614}, {9, 19303}, {10, 9680}, {11, 4834}, {12, 2236},
            {13, 1129}, {14, 598}, {15, 140}, {16, 41}, {17, 14}, {18, 2}
        } ).collect( Collectors.toMap( data -> data[0], data -> data[1] ) );

        //When
        wcts.readInputStream( testStream );
        wcts.printInfo();

        //Then
        assertThat( wcts.getAverage() ).isEqualTo( 4.209601293877134 );
        assertThat( wcts.getWordCount() ).isEqualTo( 793893 );
        assertThat( wcts.getLetterCount() ).isEqualTo( 3341973 );
        assertThat( wcts.getLengthsOfWords() ).isEqualTo( map );
    }

    private boolean verifyLogMessages( String... wantedMessages )
    {
        Stream<String> renderedMessageStream = capturedEvents.stream().map( x -> x.getMessage().getFormattedMessage() );
        List<String>   renderedMessages      = renderedMessageStream.collect( Collectors.toList() );

        boolean verified = true;
        for ( String rendered : renderedMessages )
        {
            System.out.println( rendered );
        }
        for ( String wantedMessage : wantedMessages )
        {
            verified &= renderedMessages.stream().anyMatch( s -> s.contains( wantedMessage ) );
        }

        return verified;
    }
}
