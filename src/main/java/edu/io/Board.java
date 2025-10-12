package edu.io;

public class Board {

    public int size = 8;
    public Token[][] grid;

    public Board(){
        this.grid = new Token[size][size];
        for(int i = 0; i < grid.length; i++){
            for (int x = 0; x < grid[0].length; x++){
                this.grid[i][x] = new Token("・");
            }
        }
    }

    public void placeToken(int column, int row, Token token) {
        if (isIndexValid(column, row)){
                this.grid[row][column] = token;
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
        for(int i = 0; i < grid.length; i++){
            for(int x = 0; x < grid[0].length; x++){
                this.grid[i][x].label = "・";
            }
        }
    }

    public Token square(int column, int row){
            return grid[row][column];
    }

    private boolean isIndexValid(int column, int row){
        return this.grid.length > row && row >= 0 && this.grid.length > column && column >=0;
    }
}
