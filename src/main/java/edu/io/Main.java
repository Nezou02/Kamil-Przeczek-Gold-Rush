package edu.io;
import edu.io.token.PlayerToken;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        Board board = new Board();
        PlayerToken player1 = new PlayerToken(board);

        while(flag){
            System.out.println("Which direction do you want to move? (up, down, left, right or none)");
            switch((input.nextLine()).toUpperCase()){
                case "DOWN":
                    player1.move(PlayerToken.Move.DOWN);
                    break;
                case "UP":
                    player1.move(PlayerToken.Move.UP);
                    break;
                case "RIGHT":
                    player1.move(PlayerToken.Move.RIGHT);
                    break;
                case "LEFT":
                    player1.move(PlayerToken.Move.LEFT);
                    break;
                case "BREAK":
                    flag = false;
                    break;
                default:
                    player1.move(PlayerToken.Move.NONE);
            }
        }
    }
}
