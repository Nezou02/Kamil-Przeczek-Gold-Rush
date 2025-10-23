package edu.io;
import edu.io.token.PlayerToken;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        Board board = new Board();
        Player player = new Player();
        PlayerToken playerToken = new PlayerToken(player, board);

        while(flag){
            System.out.println("Which direction do you want to move? (up, down, left, right or none)");
            switch((input.nextLine()).toUpperCase()){
                case "DOWN":
                    playerToken.move(PlayerToken.Move.DOWN);
                    break;
                case "UP":
                    playerToken.move(PlayerToken.Move.UP);
                    break;
                case "RIGHT":
                    playerToken.move(PlayerToken.Move.RIGHT);
                    break;
                case "LEFT":
                    playerToken.move(PlayerToken.Move.LEFT);
                    break;
                case "BREAK":
                    flag = false;
                    break;
                default:
                    playerToken.move(PlayerToken.Move.NONE);
            }
        }
    }
}
