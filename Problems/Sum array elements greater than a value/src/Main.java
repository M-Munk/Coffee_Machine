import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int sum = 0;
        for (int a : array) {
            if (a > m) {
                sum += a;

            }
        }
        System.out.println(sum);
    }
}