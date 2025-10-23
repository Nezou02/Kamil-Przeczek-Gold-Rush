package edu.io;
import edu.io.token.PlayerToken;

public class Player {
    private PlayerToken token;
    private double gold;

    public void assignToken(PlayerToken token){
        this.token = token;
    }

    public PlayerToken token(){
        return token;
    }
    public double gold(){ return gold; }
    public void gainGold(double amount){ gold += amount; }
    public void loseGold(double amount){ gold -= amount; }
}
