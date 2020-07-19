import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tripDuration = scanner.nextInt();
        int foodCost = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int hotelCost = scanner.nextInt();
        int tripCost = (foodCost * tripDuration) + (flightCost * 2) + (hotelCost * (tripDuration - 1));
        System.out.println(tripCost);
    }
}