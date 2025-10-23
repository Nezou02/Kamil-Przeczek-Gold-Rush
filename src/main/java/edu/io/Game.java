package edu.io;

public class Game {
    private Board board;
    private Player player;


    public Game(){ board = new Board(); }

    public void join(Player player){
        this.player = player;
    }
    public void start(){}

    public Player player(){
        return player;
    }
    public Board board(){
        return board;
    }
}
