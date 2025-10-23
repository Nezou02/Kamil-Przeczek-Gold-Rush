package edu.io.token;
import edu.io.Board;

public class PlayerToken extends Token{
    private final Board board;

    public PlayerToken(Board board){
        super(Label.PLAYER_TOKEN_LABEL);
        this.board = board;
        board.grid[0][0] = this;
    }

    public void move(Move dir){
        int newRow = row;
        int newColumn = col;

        switch (dir){
            case Move.NONE:
                System.out.println("The movement did not take place");
                return;
            case Move.LEFT:
                newColumn -=1;
                break;
            case Move.RIGHT:
                newColumn += 1;
                break;
            case Move.UP:
                newRow -=1;
                break;
            case Move.DOWN:
                newRow +=1;
                break;
        }
        if(newRow >= 0 && newRow < board.grid.length && newColumn >= 0 && newColumn < board.grid[0].length){
            board.grid[row][col] = new EmptyToken();
            board.grid[newRow][newColumn] = this;
            col = newColumn;
            row = newRow;
        }else{
            throw new IllegalArgumentException("Cannot move outside the board");
        }
    }
    public Board.Coords pos(){
        return new Board.Coords(this.col, this.row);
    }
    public Board board(){
        return this.board;
    }
    public enum Move{
        NONE,
        LEFT,
        RIGHT,
        UP,
        DOWN
    }
}
