import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float m = scanner.nextInt();
        float p = scanner.nextInt();
        float k = scanner.nextInt();
        int years = 0;
        while (k > m) {
            m = (p / 100) * m + m;
            years++;
        }
        System.out.println(years);
    }
}