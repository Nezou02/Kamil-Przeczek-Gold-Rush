package edu.io;

import edu.io.token.PlayerToken;

public class Game {
    private final Board board;
    private Player player;


    public Game(){ board = new Board(); }

    public void join(Player player){
        this.player = player;
        PlayerToken playerToken = new PlayerToken(player, board);
        player.assignToken(playerToken);
    }
    public void start(){}

    public Player player(){
        return player;
    }
    public Board board(){
        return board;
    }
}
