package core;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class WordCounterTest {

    //WordCounterTestSubject
    WordCounter wcts;

    @Before
    public void setup() {
        wcts = new WordCounter();
    }

    @Test
    public void synalogikTestString() throws IOException {
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
    public void synalogikBibleFileTest() throws IOException {
        Path currentPath = Paths.get("", "src", "test", "resources").toAbsolutePath();
        String s = currentPath.toAbsolutePath().toString();
        System.out.println(s);
    }
}
