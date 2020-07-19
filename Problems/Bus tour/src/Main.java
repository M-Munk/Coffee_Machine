import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int numBridges = scanner.nextInt();
        boolean stopped = false;
        //for (initialization; condition; modification)
        for (int i = 1; i <= numBridges && !stopped; i++) {
            int curBridge = scanner.nextInt();
            if (height >= curBridge) {
                System.out.println("Will crash on bridge " + i);
                stopped = true;
                break;
            } else if (i == numBridges) {
                System.out.println("Will not crash");
            }
        }
    }
}