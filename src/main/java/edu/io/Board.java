package edu.io;
import edu.io.token.EmptyToken;
import edu.io.token.Token;

public class Board {

    private int size = 8;
    public Token[][] grid;

    public record Coords(int col, int row){}
    public Board(){
        this.grid = new Token[size][size];
        EmptyToken emptyToken = new EmptyToken();

        for(int row = 0; row < grid.length; row++){
            for (int column = 0; column < grid[0].length; column++){
                this.grid[row][column] = emptyToken;
            }
        }
    }
    public void placeToken(int column, int row, Token token) {
        if (isIndexValid(column, row)){
                this.grid[row][column] = token;
                token.row(row);
                token.col(column);
            }

    }
    public void display(){
        for(int row = 0; row < grid.length; row++){
            for (int column = 0; column < grid[0].length; column++){
                System.out.print(grid[row][column]);
            }
        }
    }
    public void clean(){
        EmptyToken emptyToken = new EmptyToken();

        for(int row = 0; row < grid.length; row++){
            for(int column = 0; column < grid[0].length; column++){
                this.grid[row][column] = emptyToken;
            }
        }
    }
    public Token peekToken(int column, int row) {
            return grid[row][column];
    }
    public int size(){
        return this.size;
    }
    private boolean isIndexValid(int column, int row){
        return this.grid.length > row && row >= 0 && this.grid[0].length > column && column >=0;
    }
}
