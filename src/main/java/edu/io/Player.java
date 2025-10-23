package edu.io;
import edu.io.token.GoldToken;
import edu.io.token.PlayerToken;
import edu.io.token.Token;

public class Player {
    private PlayerToken token;
    private double gold = 0;

    public Player(){ }
    public void assignToken(PlayerToken token){
        this.token = token;
    }
    public PlayerToken token(){ return token; }
    public double gold(){ return gold; }
    public void gainGold(double amount){
        if(amount >= 0)
            gold += amount;
        else
            throw new IllegalArgumentException("Gain amount cannot be negative");
    }
    public void loseGold(double amount){
        if(amount >= 0) {
            double currentGold = gold;
            if ((currentGold - amount) >= 0)
                gold -= amount;
            else
                throw new IllegalArgumentException("Gold cannot go below zero");
        }else
            throw new IllegalArgumentException("Lose amount cannot be negative");
    }
    public void interactWithToken(Token token){
        if(token instanceof GoldToken goldToken) {
            double currentGold = gold;
            if((currentGold + goldToken.amount()) >= 0)
                this.gold += goldToken.amount();
            else
                throw new IllegalStateException("Gold cannot go below zero");
        }
    }
}
