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
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class WordCounterTest {

    private WordCounter wcts = new WordCounter();

    private final List<LogEvent> capturedEvents = new ArrayList<>();

    @Mock
    private Appender mockAppender;

    private Logger logger;

    @Before
    public void setup() {
        wcts = new WordCounter();

        //Given
        //Custom log Appender to get log messages for Log4j2
        when(mockAppender.getName()).thenReturn("MockAppender");
        when(mockAppender.isStarted()).thenReturn(true);

        doAnswer(invocation -> {
            LogEvent logEvent = invocation.getArgumentAt(0, LogEvent.class);
            capturedEvents.add(logEvent.toImmutable());
            return null;
        }).when(mockAppender).append(any());

        logger = (Logger) LogManager.getLogger(WordCounter.class);
        logger.addAppender(mockAppender);
        logger.setLevel(Level.ALL);
    }


    @After
    public void tearDown() {
        // the appender we added will sit in the singleton logger forever
        // slowing future things down - so remove it
        logger.removeAppender(mockAppender);
        capturedEvents.clear();
    }


    @Test
    public void synalogikStringTest() throws IOException {
        //Given
        String initialString = "Hello world & good morning. The date is 18/05/2016";
        InputStream testStream = new ByteArrayInputStream(initialString.getBytes());
        Map<Integer, Integer> map = Stream.of(new Integer[][]{
                {1, 1}, {2, 1}, {3, 1}, {4, 2}, {5, 2}, {7, 1}, {10, 1}
        }).collect(Collectors.toMap(data -> data[0], data -> data[1]));

        //When
        wcts.readInputStream(testStream);

        //Then
        assertThat(wcts.getAverage()).isEqualTo(4.555555555555555);
        assertThat(wcts.getWordCount()).isEqualTo(9);
        assertThat(wcts.getLetterCount()).isEqualTo(41);
        assertThat(wcts.getLengthsOfWords()).isEqualTo(map);
    }

    @Test
    public void allWordsSameSizeStringTest() throws IOException {
        //Given
        String initialString = "12345 12345 12345 12345 12345 12345";
        InputStream testStream = new ByteArrayInputStream(initialString.getBytes());
        Map<Integer, Integer> map = Stream.of(new Integer[][]{
                {5, 6}
        }).collect(Collectors.toMap(data -> data[0], data -> data[1]));

        //When
        wcts.readInputStream(testStream);

        //Then
        assertThat(wcts.getAverage()).isEqualTo(5);
        assertThat(wcts.getWordCount()).isEqualTo(6);
        assertThat(wcts.getLetterCount()).isEqualTo(30);
        assertThat(wcts.getLengthsOfWords()).isEqualTo(map);
    }

    @Test
    public void synalogikBibleFileTest() throws IOException {
        Path currentPath = Paths.get("", "src", "test", "resources").toAbsolutePath();
        String s = currentPath.toAbsolutePath().toString();
        System.out.println(s);
    }
}
