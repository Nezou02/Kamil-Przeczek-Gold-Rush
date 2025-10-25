package edu.io;

import edu.io.token.PlayerToken;

import java.util.Scanner;

public class Game {
    private final Board board;
    private Player player;


    public Game(){ board = new Board(); }

    public void join(Player player){
        this.player = player;
        PlayerToken playerToken = new PlayerToken(player, board);
        player.assignToken(playerToken);
    }
    public void start(){
        Scanner input = new Scanner(System.in);
        boolean flag = true;

        Player player1 = new Player();
        this.join(player1);

        while(flag){
            System.out.println("Which direction do you want to move? (up, down, left, right or none)");
            switch((input.nextLine()).toUpperCase()){
                case "DOWN":
                    player1.token().move(PlayerToken.Move.DOWN);
                    break;
                case "UP":
                    player1.token().move(PlayerToken.Move.UP);
                    break;
                case "RIGHT":
                    player1.token().move(PlayerToken.Move.RIGHT);
                    break;
                case "LEFT":
                    player1.token().move(PlayerToken.Move.LEFT);
                    break;
                case "BREAK":
                    flag = false;
                    break;
                default:
                    player1.token().move(PlayerToken.Move.NONE);
            }
        }
    }

    public Player player(){
        return player;
    }
    public Board board(){
        return board;
    }
}
