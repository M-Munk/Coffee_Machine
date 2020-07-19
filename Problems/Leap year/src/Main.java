import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int divisibleByFour = year % 4;
        int divisiblebyHundred = year % 100;
        int divisibleByFourHundred = year % 400;
        if (divisibleByFourHundred == 0) {
            System.out.println("Leap");
        } else if (divisibleByFour == 0 && divisiblebyHundred != 0) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
}