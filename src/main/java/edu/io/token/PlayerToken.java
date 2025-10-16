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
        int dirNumber = dir.ordinal();
        switch (dirNumber){
            case 0:
                System.out.println("The movement did not take place");
                break;
            case 1:
                if(this.col - 1 < 0 ){
                    throw new IllegalArgumentException("Cannot move outside the board");
                }else {
                    board.grid[row][col - 1] = this;
                    this.col = col - 1;
                    break;
                }
            case 2:
                if(this.col + 1 >= this.board.grid[0].length){
                    throw new IllegalArgumentException("Cannot move outside the board");
                }else {
                    board.grid[row][col + 1] = this;
                    this.col = col + 1;
                    break;
                }
            case 3:
                if (this.row - 1 < 0) {
                    throw new IllegalArgumentException("Cannot move outside the board");
                }else {
                    board.grid[row - 1][col] = this;
                    this.row = row - 1;
                    break;
                }
            case 4:
                if(this.row + 1 >= this.board.grid.length){
                    throw new IllegalArgumentException("Cannot move outside the board");
                }else {
                    board.grid[row + 1][col] = this;
                    this.row = row + 1;
                    break;
                }
        }
    }
    public Board.Coords pos(){
        return new Board.Coords(1,2);
    }
    public int row(){
        return this.row;
    }
    public int col(){
        return this.col;
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
