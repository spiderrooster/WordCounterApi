package cmd;

import core.WordCounter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import picocli.CommandLine;
import picocli.CommandLine.Option;
import util.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;

public class WordCountCmd implements Runnable {
    private static final Logger LOGGER = LogManager.getLogger(WordCountCmd.class);
    private final IOUtils ioUtils = new IOUtils();

    @Option(names = {"-f", "--file"}, description = "Path to file", required = true)
    private Path fileToCount;

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
        new CommandLine(new WordCountCmd()).execute(args);
    }
}
