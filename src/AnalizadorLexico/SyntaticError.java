package AnalizadorLexico;

public class SyntaticError extends AnalysisError {
    
    private String element;
    
    public SyntaticError(String msg, String element, int position) {
        super(msg, position);
        this.element = element;
    }
    
    public SyntaticError(String msg, int position) {
        super(msg, position);
    }

    public SyntaticError(String msg) {
        super(msg);
    }

    public String getElement() {
        return element;
    }
}
