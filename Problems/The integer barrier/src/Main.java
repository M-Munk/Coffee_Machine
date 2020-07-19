import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stopped = false;
        int sum = 0;
        while (scanner.hasNext() && !stopped) {
            int num = scanner.nextInt();
            sum += num;
            if (num == 0) {
                if (sum < 1000) {
                    System.out.println(sum);
                } else {
                    System.out.println(sum - 1000);
                }
                stopped = true;
                break;
            }
            if (sum >= 1000) {
                System.out.println(sum - 1000);
                stopped = true;
                break;
            }
        }
    }
}