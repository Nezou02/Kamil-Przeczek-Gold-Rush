package edu.io.token;
import edu.io.Board;
import edu.io.Player;

public class PlayerToken extends Token{
    private final Board board;
    private Player player;

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
            if(player != null){
                player.interactWithToken(board.peekToken(newColumn, newRow));
            }
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
    public Board board(){ return this.board; }
    public Player player() { return player;}
    public void assignPlayer(Player player) {
        if (this.player == null)
            this.player = player;
    }
    public Board.Coords getAvailableSquare(){
        for(int row = 0; row < board.grid.length; row++){
            for(int column = 0; column < board.grid[0].length; column++){
                if(board.grid[row][column] instanceof EmptyToken)
                    return new Board.Coords(row, column);
            }
        }
        return null;
    }
    public enum Move{
        NONE,
        LEFT,
        RIGHT,
        UP,
        DOWN
    }
}
