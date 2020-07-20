import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] twoDimArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                twoDimArray[i][j] = Math.abs(j - i);
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}