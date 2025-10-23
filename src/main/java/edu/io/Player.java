package edu.io;
import edu.io.token.PlayerToken;

public class Player {
    PlayerToken token;

    public void assignToken(PlayerToken token){
        this.token = token;
    }

    public PlayerToken token(){
        return token;
    }
}
