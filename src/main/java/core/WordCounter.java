package core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.*;

public class WordCounter {

    private static final Logger LOGGER = LogManager.getLogger(WordCounter.class);
    private int letterCount = 0;
    private int wordCount = 0;
    private double average = 0.0;
    private final Map<Integer, Integer> lengthsOfWords = new HashMap<>();

    public int getLetterCount() {
        return letterCount;
    }

    public int getWordCount() {
        return wordCount;
    }

    public double getAverage() {
        return average;
    }

    public Map<Integer, Integer> getLengthsOfWords() {
        return lengthsOfWords;
    }

    public void readInputStream(InputStream inputStream) throws IOException {
        reset();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            while (reader.ready()) {
                String trimmedLine = trimString(reader.readLine());
                List<String> split = splitString(trimmedLine, " ");
                processSplitElements(split);
            }
        } catch (IOException e) {
            LOGGER.error("Unable to create BufferedReader", e);
            throw new IOException(e);
        }
        average = averageLength(letterCount, wordCount);
    }

    private void processSplitElements(List<String> split) {
        for (String element : split) {
            int elementLength = element.length();
            if (elementLength > 0) {
                wordCount++;
                letterCount += elementLength;
                lengthsOfWords.put(elementLength, (lengthsOfWords.getOrDefault(elementLength, 0) + 1));
            }
        }
    }


    private int maxLength(List<Integer> listToMax) {
        return listToMax.stream().mapToInt(l -> l).max().orElse(0);
    }

    private String trimString(String toTrim) {
        toTrim = toTrim.replaceAll("\\.", " ");
        toTrim = toTrim.replaceAll("\\s+", " ");
        return toTrim;
    }

    private List<String> splitString(String toSplit, String regex) {
        return Arrays.asList(toSplit.split(regex));
    }

    private double averageLength(int sum, int total) {
        return sum / (double) total;
    }

    private void reset() {
        letterCount = 0;
        wordCount = 0;
        average = 0.0;
        lengthsOfWords.clear();
    }

    public void printInfo() {
        LOGGER.info("Word Count = {}", getWordCount());
        LOGGER.info("Letter Count {}", getLetterCount());
        LOGGER.info("Average word length {}", String.format("%.03f", getAverage()));

        for (Map.Entry<Integer, Integer> entry : getLengthsOfWords().entrySet()) {
            LOGGER.info("Number of words of length {} is {}", entry.getKey(), entry.getValue());
        }

        final Map<Integer, Integer> maxFrequencyMap = new HashMap<>();
        int maxFrequency = maxLength(new ArrayList<>(getLengthsOfWords().values()));
        for (Map.Entry<Integer, Integer> entry : getLengthsOfWords().entrySet()) {
            if (entry.getValue() == maxFrequency) {
                maxFrequencyMap.put(entry.getKey(), entry.getValue());
            }
        }

        StringBuilder frequencyBuilder = new StringBuilder();
        Iterator<Map.Entry<Integer, Integer>> mapIterator = maxFrequencyMap.entrySet().iterator();
        if (maxFrequencyMap.size() == 1) {
            frequencyBuilder.append("The most frequently occurring word length is ")
                    .append(maxFrequency)
                    .append(" for word lengths of ").append(new ArrayList<>(maxFrequencyMap.values()).get(0));
        } else {
            frequencyBuilder.append("The most frequently occurring word length is ")
                    .append(maxFrequency)
                    .append(" for word lengths of ");
            while (mapIterator.hasNext()) {
                frequencyBuilder.append(mapIterator.next().getKey());
                if (mapIterator.hasNext()) {
                    frequencyBuilder.append(" & ");
                }
            }
        }
        LOGGER.info(frequencyBuilder.toString());
    }
}
