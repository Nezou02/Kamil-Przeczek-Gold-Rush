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

        for(int i = 0; i < grid.length; i++){
            for (int x = 0; x < grid[0].length; x++){
                this.grid[i][x] = emptyToken;
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
        for(int i = 0; i < grid.length; i++){
            for (int x = 0; x < grid[0].length; x++){
                System.out.print(grid[i][x]);
            }
        }
    }
    public void clean(){
        EmptyToken emptyToken = new EmptyToken();

        for(int i = 0; i < grid.length; i++){
            for(int x = 0; x < grid[0].length; x++){
                this.grid[i][x] = emptyToken;
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
        return this.grid.length > row && row >= 0 && this.grid.length > column && column >=0;
    }
}
