import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean pairSum = (a + b ) == 20 || (b + c) == 20 || (a + c) == 20;
        System.out.println(pairSum);
    }
}