package abhishek.com.java.test;

import java.util.Scanner;

/**
 * Created by abhishek on 26/1/17.
 */

public class Sudoko {

    int row;
    int col;
    int N = 9;


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        Sudoko sudoko = new Sudoko();

        int[][] grid = {{3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}};

      /*  for(int i = 0 ; i < sudoko.N ; i++){
            for (int j = 0 ; j < sudoko.N ; j++){
                grid[i][j] = scan.nextInt();
            }
        }*/



        if(sudoko.solveSudoko(grid)){
            for(int i = 0 ; i < sudoko.N ; i++){
                for (int j = 0 ; j < sudoko.N ; j++){
                    System.out.print(grid[i][j]+ " ");
                }
                System.out.println();
            }
        }else{
            System.out.println("Sudoko is not solvable");
        }

    }

    private boolean solveSudoko(int[][] grid) {

        if(!findUnassignedSpace(grid))
            return true;

        int row = this.row;
        int col = this.col;

        for(int i = 1 ; i <= N ; i++){

            if(isSafe(grid,row,col,i)){

                grid[row][col] = i;

                if(solveSudoko(grid))
                    return true;

                grid[row][col] = 0;

            }
        }


        return false;
    }

    private boolean isSafe(int[][] grid, int row, int col, int i) {

        if(isValidInRow(grid,row,i) && isValidInCol(grid,col,i) && isValidInGrid(grid,row,col,i))
            return true;

        return false;
    }

    private boolean isValidInGrid(int[][] grid, int row, int col, int num) {

        int startingGridRowPos = (int) (row - row % Math.sqrt(N));
        int startingGridColPos = (int) (col - col % Math.sqrt(N));

        for(int i = 0 ; i < Math.sqrt(N) ; i++){

            for (int j = 0 ; j < Math.sqrt(N) ; j++){

                if(grid[startingGridRowPos+i][startingGridColPos+j] == num)
                    return false;
            }
        }
        return true;
    }

    private boolean isValidInCol(int[][] grid, int col, int num) {

        for (int i = 0 ; i < N ; i++){
            if(grid[i][col] == num)
                return false;
        }
        return true;
    }

    private boolean isValidInRow(int[][] grid, int row, int num) {

        for(int i = 0 ; i < N ; i++){
            if(grid[row][i] == num)
                return false;
        }
        return true;
    }


    private boolean findUnassignedSpace(int[][] grid) {

        for(row = 0 ; row < N ; row++){
            for (col = 0 ; col < N ; col++){
                if(grid[row][col] == 0)
                    return true;
            }
        }
        return false;
    }


}
