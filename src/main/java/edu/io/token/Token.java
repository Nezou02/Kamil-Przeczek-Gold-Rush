package edu.io.token;

public abstract class Token {
    private final String label;

    protected Token(String label) {
        this.label = label;
    }

    public String label(){
        return this.label;
    }
}