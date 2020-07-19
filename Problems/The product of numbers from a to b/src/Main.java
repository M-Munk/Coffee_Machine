import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long start = scanner.nextInt();
        long end = scanner.nextInt();
        long accumulator = 1;
        for (long i = start; i < end; i++) {
            accumulator *= i;
        }
        System.out.println(accumulator);
    }
}