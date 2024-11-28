package main.java.compiler.core.exceptions;

public class AnalysisError extends Exception {

    private final int position;

    public AnalysisError(String msg, int position) {
        super(msg);
        this.position = position;
    }

    public AnalysisError(String msg) {
        super(msg);
        this.position = -1;
    }

    public int getPosition() {
        return position;
    }

    public String toString() {
        return super.toString() + ", @ " + position;
    }
}
