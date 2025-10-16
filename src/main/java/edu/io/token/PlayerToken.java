package edu.io.token;
import edu.io.Board;

public class PlayerToken extends Token{

    private Board board;
    private int col;
    private int row;

    PlayerToken(Board board, int col, int row){
        super(Label.PLAYER_TOKEN_LABEL);
        this.board = board;
        this.col = col;
        this.row = row;
    }

    public void move(Move dir){
        try{
            int dirNumber = dir.ordinal();
            switch (dirNumber){
                case 0:
                    System.out.println("The movement did not take place");
                    break;
                case 1:
                    board.grid[row][col-1] = this;
                    break;
                case 2:
                    board.grid[row][col+1] = this;
                    break;
                case 3:
                    board.grid[row-1][col] = this;
                    break;
                case 4:
                    board.grid[row+1][col] = this;
                    break;
            }
        }catch (IllegalArgumentException e){
            System.out.println("Cannot move outside the board");
        }
    }

    public enum Move{
        NONE,
        LEFT,
        RIGHT,
        UP,
        DOWN
    }
}
