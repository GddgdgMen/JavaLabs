import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringBuffer inputText = new StringBuffer("Aaron bridge. shepherd? Yonex. Obstacle! Wrex.");

        String[] words = inputText.toString().split("\\s+");
        List<String> vowelWords = new ArrayList<>();

        for (String word : words) {
            if (!word.isEmpty() && isVowel(word.charAt(0))) {
                vowelWords.add(word);
            }
        }

        vowelWords.sort(Comparator.comparingInt(a -> a.charAt(1)));

        System.out.println("Sorted words: ");
        for (String word : vowelWords) {
            System.out.println(word);
        }
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}