import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        var cityIsBurg = city.endsWith("burg");
        System.out.println(cityIsBurg);
    }
}