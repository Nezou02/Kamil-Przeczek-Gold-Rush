package edu.io.token;

public abstract class Token {
    private final String label;
    protected int col;
    protected int row;
    public Token(String label) {
        this.label = label;
    }
    public void row(int value){
        this.row = value;
    }
    public void col(int value){
        this.col = value;
    }
    public int row(){
        return this.row;
    }
    public int col(){
        return this.col;
    }
    public String label(){
        return this.label;
    }
}