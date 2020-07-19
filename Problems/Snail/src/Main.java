import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poleHeight = scanner.nextInt();
        int upDay = scanner.nextInt();
        int downNight = scanner.nextInt();
        int remainder = (poleHeight - downNight) % (upDay - downNight);
        int dayToTop = (poleHeight - downNight) / (upDay - downNight);
        if (remainder != 0) {
            System.out.println(dayToTop + 1);
        } else {
            System.out.println(dayToTop);
        }

    }
}