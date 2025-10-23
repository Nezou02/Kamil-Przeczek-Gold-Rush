package edu.io;
import edu.io.token.GoldToken;
import edu.io.token.PlayerToken;
import edu.io.token.Token;

public class Player {
    private PlayerToken token;
    private double gold;

    public void assignToken(PlayerToken token){
        this.token = token;
        this.token.assignPlayer(this);
    }
    public PlayerToken token(){ return token; }
    public double gold(){ return gold; }
    public void gainGold(double amount){ gold += amount; }
    public void loseGold(double amount){ gold -= amount; }
    public void interactWithToken(Token token){
        if(token instanceof GoldToken gold) {
            this.gold += gold.amount();
        }
    }
}
