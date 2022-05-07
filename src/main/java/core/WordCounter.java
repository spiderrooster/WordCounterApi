package core;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class WordCounter {
    private int letterSum = 0;
    private int wordCount = 0;
    private double average = 0.0;
    private Map<Integer, Integer> lengthsOfWords = new HashMap<>();

    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();
        String initialString = "Hello world & good morning. The date is 18/05/2016";
        InputStream targetStream = new ByteArrayInputStream(initialString.getBytes());

        wordCounter.readInputStream(targetStream);
        System.out.println("Word Count = " + wordCounter.getWordCount());
        System.out.println("Letter Count " + wordCounter.getLetterSum());
        System.out.printf("Average word length %f \n\r", wordCounter.getAverage());

        for (Map.Entry<Integer, Integer> entry : wordCounter.getLengthsOfWords().entrySet()) {
            System.out.printf("Number of words of length %d is %d \n\r", entry.getKey(), entry.getValue());
        }
    }

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

    public void readInputStream(InputStream inputStream) {
        letterSum = 0;
        wordCount = 0;
        average = 0.0;
        lengthsOfWords.clear();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            while (reader.ready()) {
                String trimmedLine = trimString(reader.readLine());
                List<String> split = splitString(trimmedLine, " ");
                processSplit(split);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        average = averageLength(letterSum, wordCount);
    }

    private void processSplit(List<String> split) {
        for (String element : split) {
            System.out.println(element + " " + element.length());
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

    public double averageLengthList(List<String> listToAverage) {
        return listToAverage.stream().map(String::length).mapToDouble(l -> l).average().orElse(0.0);
    }
}
