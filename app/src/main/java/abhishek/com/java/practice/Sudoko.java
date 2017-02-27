package abhishek.com.java.practice;

import java.util.Scanner;

/**
 * Created by abhishek on 4/1/17.
 */

public class Sudoko {

    private int squareRootNumber = 3;

    private int N = 9;
    int row = 0, col = 0;


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[][] grid = new int[9][9];

        Sudoko sudoko = new Sudoko();


        //Reading input from the user
        for (int j = 0; j < sudoko.N; j++) {
            for (int k = 0; k < sudoko.N; k++) {
                grid[j][k] = s.nextInt();
            }
        }


        if (sudoko.solveSudoko(grid)) {
            for (int i = 0; i < sudoko.N; i++) {
                for (int j = 0; j < sudoko.N; j++) {
                    System.out.print(grid[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Not solvable");
        }

    }


    private boolean solveSudoko(int[][] grid) {


        int row = 0, col = 0;

        if (!findUnassignedSpace(grid)) {
            return true;
        }
        row = this.row;
        col = this.col;
        for (int num = 1; num <= N; num++) {
            if (isSafeSpace(grid, row, col, num)) {

                grid[row][col] = num;

                if (solveSudoko(grid))
                    return true;

                grid[row][col] = 0;
            }

        }
        return false;
    }

    private boolean isSafeSpace(int[][] grid, int row, int col, int num) {

        if (isNumberValidInRow(grid, row, num) && isNumberValidInColumn(grid, col, num) && isNumberValidInGrid(grid, row, col, num)) {
            return true;
        }
        return false;
    }

    private boolean findUnassignedSpace(int[][] grid) {

        for (row = 0; row < N; row++) {
            for (col = 0; col < N; col++) {

                if (grid[row][col] == 0) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean isNumberValidInRow(int[][] grid, int row, int num) {

        for (int i = 0; i < N; i++) {
            if (grid[row][i] == num) {
                return false;
            }
        }

        return true;
    }

    private boolean isNumberValidInColumn(int[][] grid, int column, int num) {

        for (int i = 0; i < N; i++) {
            if (grid[i][column] == num) {
                return false;
            }
        }

        return true;
    }

    private boolean isNumberValidInGrid(int[][] grid, int row, int col, int num) {

        int startingRow = row - row % squareRootNumber;
        int startingColumn = col - col % squareRootNumber;

        for (int i = 0; i < squareRootNumber; i++) {
            for (int j = 0; j < squareRootNumber; j++) {

                if (grid[i + startingRow][j + startingColumn] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}
