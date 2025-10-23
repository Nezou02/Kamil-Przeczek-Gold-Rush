package edu.io.token;

public class GoldToken extends Token{
    protected double amount;

    public GoldToken() {
        super(Label.GOLD_TOKEN_LABEL);
        amount = 1;
    }
    public GoldToken(double amount){
        super(Label.GOLD_TOKEN_LABEL);
        if(amount < 0)
            throw new IllegalArgumentException("Gold value cannot be negatvie");
        this.amount = amount;
    }
    public double amount() { return amount; }
}
