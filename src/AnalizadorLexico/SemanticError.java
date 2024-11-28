package AnalizadorLexico;

public class SemanticError extends AnalysisError {
    public SemanticError(String msg, int position) {
        super(msg, position);
    }
}