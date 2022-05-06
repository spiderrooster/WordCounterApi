package core;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class WordCounter {

    int letterSum = 0;
    int wordSum = 0;
    double average = 0.0;

    List<Counter> lengthsOfWords;

    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();
        String initialString = "Hello world & good morning. The date is 18/05/2016";
        InputStream targetStream = new ByteArrayInputStream(initialString.getBytes());

        wordCounter.readInputStream(targetStream);
        System.out.println("Word Count = " + wordCounter.getWordSum());
        System.out.println("Letter  Count " + wordCounter.getLetterSum());
        System.out.println("Average word length " + wordCounter.getAverage());
    }

    public int getLetterSum() {
        return letterSum;
    }

    public int getWordSum() {
        return wordSum;
    }

    public double getAverage() {
        return average;
    }

    public void readInputStream(InputStream inputStream) {
        letterSum = 0;
        wordSum = 0;
        average = 0.0;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            while (reader.ready()) {
                String trimmedLine = trimString(reader.readLine());
                letterSum += trimmedLine.length();
                List<String> split = splitString(trimmedLine, " ");
                wordSum += split.size();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        average = averageLength(letterSum, wordSum);
    }

    public String trimString(String toTrim) {
        return toTrim.replaceAll("\\s+", " ");
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

    public int maxLength(List<String> listToMax) {
        return listToMax.stream().map(String::length).mapToInt(l -> l).max().orElse(0);
    }

    public int minLength(List<String> listToMax) {
        return listToMax.stream().map(String::length).mapToInt(l -> l).min().orElse(0);
    }

}
