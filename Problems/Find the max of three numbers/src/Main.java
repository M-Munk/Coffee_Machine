import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        int d = 0;
        if (a >= b && a >= c) {
            d = 1;
        }
        if (b > a && b >= c) {
            d = 2;
        }
        if (c > a && c > b) {
            d = 3;
        }
        return d;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}