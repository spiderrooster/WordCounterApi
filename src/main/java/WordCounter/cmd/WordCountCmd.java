package WordCounter.cmd;

import WordCounter.core.WordCounter;
import WordCounter.util.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import picocli.CommandLine;
import picocli.CommandLine.Option;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;

public class WordCountCmd implements Runnable {
    private static final Logger LOGGER = LogManager.getLogger(WordCountCmd.class);
    private IOUtils ioUtils;

    @Option(names = {"-f", "--file"}, description = "Path to file", required = true)
    private Path fileToCount;

    public void setIoUtils(IOUtils ioUtils) {
        this.ioUtils = ioUtils;
    }

    @Override
    public void run() {
        if (ioUtils.doesExist(fileToCount) && ioUtils.isRegularFile(fileToCount)) {
            WordCounter wordCounter = new WordCounter();
            try {
                InputStream is = ioUtils.createInputStream(fileToCount);
                wordCounter.readInputStream(is);
            } catch (IOException e) {
                LOGGER.error("Unable to create InputStream", e);
            }
        }
    }

    public static void main(String[] args) {
        WordCountCmd wordCountCmd = new WordCountCmd();
        wordCountCmd.setIoUtils(new IOUtils());
        new CommandLine(wordCountCmd).execute(args);
    }
}
