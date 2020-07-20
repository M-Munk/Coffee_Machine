import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] twoDimArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                twoDimArray[i][j] = scanner.nextInt();
            }
        }
        boolean broken = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (twoDimArray[i][j] != twoDimArray[j][i]) {
                    broken = true;
                    break;
                }
            }
        }

        if (broken) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }
}
