package AnalizadorLexico;

public class LexicalError extends AnalysisError {

    private String element;

    public LexicalError(String msg, String element, int position) {
        super(msg, position);
        this.element = element;
    }

    public LexicalError(String msg) {
        super(msg);
    }

    public String getElement() {
        return element;
    }
    
    // do novo Lexical Error
    public LexicalError(String msg, int position)
	 {
        super(msg, position);
    }
}