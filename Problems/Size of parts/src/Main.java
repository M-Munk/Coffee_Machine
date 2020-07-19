import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fix = 0;
        int reject = 0;
        int ship = 0;
        int status = 0;
        int numberParts = scanner.nextInt();
        for (int i = 1; i <= numberParts; i++) {
            status = scanner.nextInt();
            if (status == -1) {
                reject++;
            } else if (status == 0) {
                ship++;
            } else if (status == 1) {
                fix++;
            }
        }
        System.out.println(ship + " " + fix + " " + reject);
    }
}
