package cmd;

import core.WordCounter;
import util.IOUtils;
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
    private WordCounter wordCounter;

    @Option(names = {"-f", "--file"}, description = "Path to file", required = true)
    private Path fileToCount;

    public void setIoUtils(IOUtils ioUtils) {
        this.ioUtils = ioUtils;
    }

    public void setWordCounter(WordCounter wordCounter) {
        this.wordCounter = wordCounter;
    }

    @Override
    public void run() {
        if (ioUtils.doesExist(fileToCount) && ioUtils.isRegularFile(fileToCount)) {
            try {
                InputStream is = ioUtils.createInputStream(fileToCount);
                wordCounter.readInputStream(is);
                wordCounter.printInfo();
            } catch (IOException e) {
                LOGGER.error(e);
            }
        }
    }

    public static void main(String[] args) {
        WordCountCmd wordCountCmd = new WordCountCmd();
        wordCountCmd.setIoUtils(new IOUtils());
        wordCountCmd.setWordCounter(new WordCounter());
        new CommandLine(wordCountCmd).execute(args);
    }
}
