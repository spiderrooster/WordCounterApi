package core;

import cmd.WordCountCmd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class WordCounter {

    private static Logger LOGGER = LogManager.getLogger(WordCounter.class);
    private int letterSum = 0;
    private int wordCount = 0;
    private double average = 0.0;
    private final Map<Integer, Integer> lengthsOfWords = new HashMap<>();

    public int getLetterSum() {
        return letterSum;
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

    public void printInfo() {
        System.out.println("Word Count = " + getWordCount());
        System.out.println("Letter Count " + getLetterSum());
        System.out.printf("Average word length %f \n\r", getAverage());

        for (Map.Entry<Integer, Integer> entry : getLengthsOfWords().entrySet()) {
            System.out.printf("Number of words of length %d is %d \n\r", entry.getKey(), entry.getValue());
        }

        final Map<Integer, Integer> maxFrequencyMap = new HashMap<>();
        int maxFrequency = maxLength(new ArrayList<>(getLengthsOfWords().values()));
        for (Map.Entry<Integer, Integer> entry : getLengthsOfWords().entrySet()) {
            if (entry.getValue() == maxFrequency) {
                maxFrequencyMap.put(entry.getKey(), entry.getValue());
            }
        }

        Iterator<Map.Entry<Integer, Integer>> mapIterator = maxFrequencyMap.entrySet().iterator();

    }

    private int maxLength(List<Integer> listToMax) {
        return listToMax.stream().mapToInt(l -> l).max().orElse(0);
    }

    public void readInputStream(InputStream inputStream) {
        reset();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            while (reader.ready()) {
                String trimmedLine = trimString(reader.readLine());
                List<String> split = splitString(trimmedLine, " ");
                processSplitElements(split);
            }
        } catch (IOException e) {
            LOGGER.error("Unable to create BufferedReader", e);
            throw new RuntimeException(e);
        }
        average = averageLength(letterSum, wordCount);
    }

    private void processSplitElements(List<String> split) {
        for (String element : split) {
            int elementLength = element.length();
            if (elementLength > 0) {
                wordCount++;
                letterSum += elementLength;
                if (lengthsOfWords.containsKey(elementLength)) {
                    lengthsOfWords.put(elementLength, (lengthsOfWords.get(elementLength) + 1));
                } else {
                    lengthsOfWords.put(elementLength, elementLength);
                }
            }
        }
    }

    public String trimString(String toTrim) {
        toTrim = toTrim.replaceAll("\\.", " ");
        toTrim = toTrim.replaceAll("\\s+", " ");
        return toTrim;
    }

    public List<String> splitString(String toSplit, String regex) {
        return Arrays.asList(toSplit.split(regex));
    }

    public double averageLength(int sum, int total) {
        return sum / (double) total;
    }

    public void reset() {
        letterSum = 0;
        wordCount = 0;
        average = 0.0;
        lengthsOfWords.clear();
    }
}
