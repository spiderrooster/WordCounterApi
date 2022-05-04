package core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class WordCounter {

    long wordSum = 0;
    long wordTally = 0;
    double average = 0.0;

    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();

        String result = wordCounter.trimString("hello   hello    hello");
        System.out.println(result);

        double avergae = wordCounter.averageLengthList(Arrays.asList("12", "hello", "hello"));
        System.out.println(avergae);

        int max = wordCounter.maxLength(Arrays.asList("12", "12345", "123456789"));
        System.out.println("max: " + max);

        int min = wordCounter.minLength(Arrays.asList("12", "12345", "123456789"));
        System.out.println("min: " + min);

        int total = 0;

        String trimmed = wordCounter.trimString("Hello world & good morning. The date is 18/05/2016");
        List<String> split = wordCounter.splitString(trimmed, " ");
        total += split.size();
        System.out.println("Word Count = " + total);
        System.out.println("Word Count = " + total);
    }

    public void readInputStream(InputStream inputStream) {
        wordSum = 0;
        wordTally = 0;
        average = 0.0;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            while (reader.ready()) {
                String trimmedLine = trimString(reader.readLine());
                List<String> split = splitString(trimmedLine, " ");
                for (String value : split) {
                    wordSum += value.length();
                }
                wordTally += split.size();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        average = (double) wordSum / (double) wordTally;
    }

    public String trimString(String toTrim) {
        return toTrim.replaceAll("\\s+", " ");
    }

    public List<String> splitString(String toSplit, String regex) {
        return Arrays.asList(toSplit.split(regex));
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
