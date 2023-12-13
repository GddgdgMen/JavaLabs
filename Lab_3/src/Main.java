import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        StringBuffer inputText = new StringBuffer("Aaron bridge. shepherd? Yonex. Obstacle! Wrex.");

        StringBuffer result = sortWordsBySecondLetter(inputText);

        System.out.println("Sorted words " + result);
    }

    private static StringBuffer sortWordsBySecondLetter(StringBuffer inputText) {
        String[] words = inputText.toString().split("\\s+");

        StringBuffer result = new StringBuffer();
        Arrays.stream(words)
                .filter(word -> word.length() > 1 && isVowel(word.charAt(0)))
                .sorted(Comparator.comparingInt(word -> word.charAt(1)))
                .forEach(word -> result.append(word).append(" "));

        return result;
    }

    private static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}
