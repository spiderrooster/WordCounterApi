import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordCounter {

    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();

        String result = wordCounter.trimString("hello   hello    hello");
        System.out.println(result);

        double avergae = wordCounter.averageLength(Arrays.asList("12", "hello", "hello"));
        System.out.println(avergae);

        int max = wordCounter.maxLength(Arrays.asList("12", "12345", "123456789"));
        System.out.println("max: " + max);

        int min = wordCounter.minLength(Arrays.asList("12", "12345", "123456789"));
        System.out.println("min: " + min);

        int total = 0;

        String trimmed = wordCounter.trimString("Hello world & good morning. The date is 18/05/2016");
        List<String> split = wordCounter.splitString(trimmed);
        total += split.size();
        System.out.println("Word Count = " + total);
        System.out.println("Word Count = " + total);
    }

    public String trimString(String toTrim) {
        return toTrim.replaceAll("\\s+", " ");
    }

    public List<String> splitString(String toSplit) {
        return Arrays.asList(toSplit.split(" "));
    }

    public double averageLength(List<String> listToAverage) {
        return listToAverage.stream().map(String::length).mapToDouble(l -> l).average().orElse(0.0);
    }

    public int maxLength(List<String> listToMax) {
        return listToMax.stream().map(String::length).mapToInt(l -> l).max().orElse(0);
    }

    public int minLength(List<String> listToMax) {
        return listToMax.stream().map(String::length).mapToInt(l -> l).min().orElse(0);
    }

}
