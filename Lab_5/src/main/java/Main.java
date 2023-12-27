import java.util.*;

public class Main {
    public static void main(String[] args) {
        Text text = newText();
        List<Word> words = textToWords(text);
        List<Word> vowelWords = vowelWords(words);
        List<Word> secondLetterSort = new ArrayList<>(vowelWords);
        secondLetterSort.sort(Comparator.comparingInt(word -> word.toString().charAt(1)));

        printer(secondLetterSort.toArray(new TextProcessor[0]));
    }

    public static Text newText(){
        StringBuffer inputText = new StringBuffer("Aaron bridge. shepherd? Yonex. Obstacle! Wrex.");
        char[] lines = inputText.toString().toCharArray();
        char[][] sent = splitter(lines);
        Sentence[] sentenceElements = new Sentence[sent.length];

        for (int i = 0; i < sent.length; i++){
            Sentence sentence = new Sentence(processor(sent[i]));
            sentenceElements[i] = sentence;
        }

        return new Text(sentenceElements);
    }

    public static char[][] splitter(char[] lines){
        List<char[]> sentences = new ArrayList<>();
        List<Character> wordChars = new ArrayList<>();

        for (char ch : lines) {
            if (Character.toString(ch).matches("[.!?]")) {
                storeChars(sentences, wordChars);
                sentences.add(new char[]{ch});
            } else if (Character.toString(ch).matches("[a-zA-Z'`]|\\d")) {
                wordChars.add(ch);
            } else if (ch == ' ') {
                storeChars(sentences, wordChars);
            } else {
                sentences.add(new char[]{ch});
            }
        }
            if (!wordChars.isEmpty()) {
                char[] storedCharacters = new char[wordChars.size()];
                for (int i = 0; i < wordChars.size(); i++) {
                    storedCharacters[i] = wordChars.get(i);
                }
                sentences.add(storedCharacters);
            }

            char[][] result = new char[sentences.size()][];
            for (int i = 0; i < sentences.size(); i++) {
                result[i] = sentences.get(i);
            }
            return result;
        }

    private static void storeChars(List<char[]> sentences, List<Character> wordChars){
        if (!wordChars.isEmpty()) {
            char[] storedCharacters = new char[wordChars.size()];
            for (int i = 0; i < wordChars.size(); i++) {
                storedCharacters[i] = wordChars.get(i);
            }
            sentences.add(storedCharacters);
            wordChars.clear();
        }
    }

    public static TextProcessor[] processor(char[] chars){
        List<TextProcessor> processed = new ArrayList<>();
        List<Letter> wordChars = new ArrayList<>();

        for (char ch : chars){
            if (Character.toString(ch).matches("[a-zA-Z`]|\\d")){
                wordChars.add(new Letter(ch));
            } else {
                if (!wordChars.isEmpty()) {
                    processed.add(createWord(wordChars.toArray(new Letter[0])));
                    wordChars.clear();
                }
                if (ch != ' ') {
                    processed.add(new Punctuation(ch));
                }
            }
        }
        if (!wordChars.isEmpty()) {
            processed.add(createWord(wordChars.toArray(new Letter[0])));
        }

        return processed.toArray(new TextProcessor[0]);
    }

    public static Word createWord(Letter[] letters) {
        return new Word(letters);
    }

    public static List<Word> textToWords(Text text){
        List<Word> words = new ArrayList<>();

        for (Sentence sentence : text.getSentences()){
            for (TextProcessor processor : sentence.getProcessed()){
                if (processor instanceof Word){
                    words.add((Word) processor);
                }
            }
        }

        return words;
    }

    public static List<Word> vowelWords(List<Word> words){
        Map<String, Word> vowWordMap = new LinkedHashMap<>();

        for (Word word : words){
            String wordString = word.toString();
            if (isVowel(wordString.charAt(0))){
                vowWordMap.putIfAbsent(wordString, word);
            }
        }
        return new ArrayList<>(vowWordMap.values());
    }

    public static void printer (TextProcessor[] array){
        for (TextProcessor processor : array){
            System.out.print(processor.toString() + "\n");
        }
    }
    private static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}