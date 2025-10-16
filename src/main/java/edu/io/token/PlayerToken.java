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


    }

    public enum Move{
        NONE,
        LEFT,
        RIGHT,
        UP,
        DOWN
    }
}
