package cmd;

import core.WordCounter;
import org.mockito.Mock;
import util.IOUtils;

public class WordCountCmdTest {

    @Mock
    private IOUtils ioUtilsMock;
    @Mock
    private WordCounter wordCounterMock;

    public WordCountCmdTest() {
    }
}
