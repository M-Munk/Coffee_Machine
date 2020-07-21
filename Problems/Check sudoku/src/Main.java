//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Scanner;
//import java.util.Set;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int nSquare = n * n;
//        //read values into matrix
//        Integer[][] sudoku = new Integer[nSquare][nSquare];
//        for (int i = 0; i < nSquare; i++) {
//            for (int j = 0; j < nSquare; j++) {
//                sudoku[i][j] = scanner.nextInt();
//            }
//        }
//        //set assume sudoku solved
//        boolean broken;
//        //check input is in range
//        broken = n < 1 || n > 10;
//        //check matrix is in range
//        for (int col = 0; col < nSquare; col++) {
//            for (int row = 0; row < nSquare; row++) {
//                if (sudoku[row][col] > nSquare) {
//                    broken = true;
//                    break;
//                }
//            }
//        }
//
//        //check rows
//        for (int row = 0; row < nSquare; row++) {
////            int[] copyTo = new int[nSquare];
//            for (int col = 0; col < nSquare - 1; col++) {
////                System.arraycopy(9);
//                if (sudoku[row][col].equals(sudoku[row][col + 1]))  {
//                    broken = true;
//                    break;
//                }
//           }
//        }
//
//        //check columns
//        for (int col2 = 0; col2 < nSquare; col2++) {
//            for (int row2 = 0; row2 < nSquare - 1; row2++) {
//                if (sudoku[row2][col2].equals(sudoku[row2 + 1][col2])) {
//                    broken = true;
//                    break;
//                }
//            }
//        }
//
//        //check grids
//        Integer[][] square;
//        for (int row = 0; row < n; row++) {
//          for (int col = 0; col < n; col++) {
//              for (int i = 0; i < n; i++) {
//                  for (int j = 0; j < n; j++) {
//                      public static int[] copyOfRange(int[] original,
//                      int from,
//                      int to);
//                      square = Arrays.copyOfRange(sudoku, i * n, j * n);
//                      Set<Integer> squareSet = new HashSet<>();
//                      Arrays.stream(square).map(Arrays::asList).forEach(squareSet::addAll);
//                      if (square.length != squareSet.size()) {
//                          broken = true;
//                          break;
//                      }
//                  }
//              }
//          }
//        }
//
//        if (broken) {
//            System.out.println("NO");
//        } else {
//            System.out.println("YES");
//        }
//    }
//}
import java.util.*;
class HelloWorld {
    public Scanner scanner = new Scanner(System.in);
    // Function to check if a given row is valid. It will return:
    // -1 if the row contains an invalid value
    // 0 if thr row contains repeated values
    // 1 is the row is valid.
    public int n = scanner.nextInt();
    public int nSquare = n * n;
    public int valid_row(int row, int [][] grid){
        int[] temp = grid[row];
        Set<Integer>set = new HashSet<>();
        for (int value : temp) {
            // Checking for values outside 0 and 9;
            // 0 is considered valid because it
            // denotes an empty cell.
            // Removing zeros and the checking for values and
            // outside 1 and 9 is another way of doing
            // the same thing.
            if (value < 0 || value > nSquare){
                System.out.println( "Invalid value" );
                return -1;
            }
            //Checking for repeated values.
            else if (value != 0){
                if (!set.add(value)) {
                    return 0;
                }
            }
        }
        return 1;
    }
    // Function to check if a given column is valid. It will return:
    // -1 if the column contains an invalid value
    // 0 if the column contains repeated values
    // 1 is the column is valid.
    public int valid_col(int col, int [][] grid){
        Set<Integer>set = new HashSet<>();
        for (int i =0 ; i< nSquare; i++) {
            // Checking for values outside 0 and 9;
            // 0 is considered valid because it
            // denotes an empty cell.

            // Removing zeros and the checking for values and
            // outside 1 and 9 is another way of doing
            // the same thing.
            if (grid[i][col] < 0 || grid[i][col] > nSquare){
                System.out.println( "Invalid value" );
                return -1;
            }
            // Checking for repeated values.
            else if (grid[i][col] != 0){
                if (!set.add(grid[i][col])) {
                    return 0;
                }
            }
        }
        return 1;
    }
    // Function to check if all the subsquares are valid. It will return:
// -1 if a subsquare contains an invalid value
// 0 if a subsquare contains repeated values
// 1 if the subsquares are valid.
    public int valid_subsquares(int [][] grid){
        for (int row = 0 ; row < nSquare; row = row + n) {
            for (int col = 0; col < nSquare; col = col + n) {
                Set<Integer>set = new HashSet<>();
                for(int r = row; r < row+3; r++) {
                    for(int c= col; c < col+3; c++){
                        // Checking for values outside 0 and 9;
                        // 0 is considered valid because it
                        // denotes an empty cell.
                        // Removing zeros and the checking for values and
                        // outside 1 and 9 is another way of doing
                        // the same thing.
                        if (grid[r][c] < 0 || grid[r][c] > nSquare){
                            System.out.println( "Invalid value" );
                            return -1;
                        }
                        // Checking for repeated values.
                        else if (grid[r][c] != 0){
                            if (!set.add(grid[r][c])) {
                                return 0;
                            }
                        }
                    }
                }
            }
        }
        return 1;
    }
    //Function to check if the board invalid.
    public void valid_board(int [][] grid){
        // Checking the rows and columns.
        for (int i =0 ; i< nSquare; i++) {
            int res1 = valid_row(i, grid);
            int res2 = valid_col(i, grid);
            // if a row or column is invalid, then the board is invalid.
            if (res1 < 1 || res2 < 1) {
                System.out.println( "NO" );
                return;
            }
        }
        int res3 = valid_subsquares(grid);
        // if any one the subsquares is invalid, then the board is invalid.
        if (res3 < 1) {
            System.out.println( "NO" );
        }
        else {
            System.out.println( "YES" );
        }
    }
    // Function to print the board.
//    public static void print_board(int [][] grid){
//        for (int[] row : grid) {
//            System.out.print("[");
//            for (int y : row) {
//                System.out.print(y + ", ");
//            }
//            System.out.println("]");
//        }
//    }

    public void main(String[] args) {
        // get board
        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int nSquare = n * n;
        //read values into matrix
        int[][] board = new int[nSquare][nSquare];
        for (int i = 0; i < nSquare; i++) {
            for (int j = 0; j < nSquare; j++) {
                board[i][j] = scanner.nextInt();
            }
        }
//        int [] [] board = {
//                {1, 4, 7, 0, 0, 0, 0, 0, 3},
//                {2, 5, 0, 0, 0, 1, 0, 0, 0},
//                {3, 0, 9, 0, 0, 0, 0, 0, 0},
//                {0, 8, 0, 0, 2, 0, 0, 0, 4},
//                {0, 0, 0, 4, 1, 0, 0, 2, 0},
//                {9, 0, 0, 0, 0, 0, 6, 0, 0},
//                {0, 0, 3, 0, 0, 0, 0, 0, 9},
//                {4, 0, 0, 0, 0, 2, 0, 0, 0},
//                {0, 0, 1, 0, 0, 8, 0, 0, 7},
//        };
//        print_board(board);
        valid_board(board);
        // An invalid board. The first row contains
        // repeated values.
//        int [] [] board2 = {
//                {1, 4, 4, 0, 0, 0, 0, 0, 3},
//                {2, 5, 0, 0, 0, 1, 0, 0, 0},
//                {3, 0, 9, 0, 0, 0, 0, 0, 0},
//                {0, 8, 0, 0, 2, 0, 0, 0, 4},
//                {0, 0, 0, 4, 1, 0, 0, 2, 0},
//                {9, 0, 0, 0, 0, 0, 6, 0, 0},
//                {0, 0, 3, 0, 0, 0, 0, 0, 9},
//                {4, 0, 0, 0, 0, 2, 0, 0, 0},
//                {0, 0, 1, 0, 0, 8, 0, 0, 7},
//        };
//        print_board(board2);
//        valid_board(board2);
    }
}
