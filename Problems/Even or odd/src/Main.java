import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stopped = false;
        int num;
        while (scanner.hasNext() && !stopped) {
            num = scanner.nextInt();
            if (num == 0) {
                stopped = true;
                break;
            }
            if (num % 2 == 0) {
                System.out.println("even");
            }
            if (num % 2 != 0) {
                System.out.println("odd");
            }
        }
    }
}