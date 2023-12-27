public class Sentence {
    private final TextProcessor[] processed;

    public Sentence(TextProcessor[] processors) {
        this.processed = processors;
    }


    public TextProcessor[] getProcessed() {
        return processed;
    }
}