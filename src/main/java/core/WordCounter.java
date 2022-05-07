package core;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class WordCounter {

    int letterSum = 0;
    int wordSum = 0;
    double average = 0.0;

    Map<Integer, Counter> lengthsOfWords = new HashMap<>();

    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();
        String initialString = "Hello world & good morning. The date is 18/05/2016";
        InputStream targetStream = new ByteArrayInputStream(initialString.getBytes());

        wordCounter.readInputStream(targetStream);
        System.out.println("Word Count = " + wordCounter.getWordSum());
        System.out.println("Letter Count " + wordCounter.getLetterSum());
        System.out.printf("Average word length %f", wordCounter.getAverage());
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
        average = averageLength(letterSum, wordSum);
    }

    private void processSplit(List<String> split) {
        for (String element : split) {
            int elementLength = element.length();
            if (elementLength > 0) {
                wordSum++;
                letterSum += elementLength;
                if (lengthsOfWords.stream().map(x -> x.length).collect(Collectors.toList()).contains(elementLength)) {
                    lengthsOfWords.get()
                } else {
                    lengthsOfWords.add(new Counter(elementLength, elementLength))
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
