import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        boolean broken = false;
        final int rows = 4;
        final int cols = 4;
        char[][] colorScheme = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            String data;
            data = scanner.next();
            for (int j = 0; j < cols; j++) {
                colorScheme[i][j] = data.charAt(j);
            }
        }

        //check grids
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char a = colorScheme[i][j];
                char b = colorScheme[i][j + 1];
                char c = colorScheme[i + 1][j];
                char d = colorScheme[i + 1][j + 1];
                if (a == b && a == c && a == d) {
                    broken = true;
                    break;
                }
            }
        }
        System.out.println(broken ? "NO" : "YES");
    }
}