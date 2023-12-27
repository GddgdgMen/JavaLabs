public class Punctuation extends TextProcessor {
    private final char value;

    public Punctuation(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }
    @Override
    public String toString() {
        return Character.toString(value);
    }
}