public class Text {
    private final Sentence[] sentences;


    public Text(Sentence[] processed) {
        this.sentences = processed;
    }


    public Sentence[] getSentences() {
        return sentences;
    }
}