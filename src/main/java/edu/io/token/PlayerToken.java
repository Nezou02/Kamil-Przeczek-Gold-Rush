package edu.io.token;
import edu.io.Board;

public class PlayerToken extends Token{
    private final Board board;

    public PlayerToken(Board board){
        super(Label.PLAYER_TOKEN_LABEL);
        this.board = board;
        board.grid[0][0] = this;
    }
// jak gracz sie ruszy to tam jest puste pole na razie tak robie moze trzeab bedzie zmineic
    public void move(Move dir){
        int dirNumber = dir.ordinal();
        switch (dirNumber){
            case 0:
                System.out.println("The movement did not take place");
                break;
            case 1:
                if(this.col - 1 < 0 ){
                    throw new IllegalArgumentException("Cannot move outside the board");
                }else {
                    board.grid[row][col] = new EmptyToken();
                    board.grid[row][col - 1] = this;
                    this.col = col - 1;
                    break;
                }
            case 2:
                if(this.col + 1 >= this.board.grid[0].length){
                    throw new IllegalArgumentException("Cannot move outside the board");
                }else {
                    board.grid[row][col] = new EmptyToken();
                    board.grid[row][col + 1] = this;
                    this.col = col + 1;
                    break;
                }
            case 3:
                if (this.row - 1 < 0) {
                    throw new IllegalArgumentException("Cannot move outside the board");
                }else {
                    board.grid[row][col] = new EmptyToken();
                    board.grid[row - 1][col] = this;
                    this.row = row - 1;
                    break;
                }
            case 4:
                if(this.row + 1 >= this.board.grid.length){
                    throw new IllegalArgumentException("Cannot move outside the board");
                }else {
                    board.grid[row][col] = new EmptyToken();
                    board.grid[row + 1][col] = this;
                    this.row = row + 1;
                    break;
                }
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
