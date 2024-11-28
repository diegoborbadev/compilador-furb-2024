package main.java.compiler.core.exceptions;

import main.java.compiler.core.Token;

public class SyntaticError extends AnalysisError {

    private final int tokenId;
    private final int errorId;
    private final String element;

    public SyntaticError(String msg, int errorId, Token token) {
        this(msg, errorId, token.getId(), token.getLexeme(), token.getPosition());
    }

    public SyntaticError(String msg, int errorId, int tokenId, String element, int position) {
        super(msg, position);
        this.errorId = errorId;
        this.element = element;
        this.tokenId = tokenId;
    }
    
    public String getElement() {
        return element;
    }

    public int getTokenId() {
        return tokenId;
    }

    public int getErrorId() {
        return errorId;
    }
}
