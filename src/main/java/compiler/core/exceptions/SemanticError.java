package main.java.compiler.core.exceptions;

public class SemanticError extends AnalysisError {
    public SemanticError(String msg, int position) {
        super(msg, position);
    }
}