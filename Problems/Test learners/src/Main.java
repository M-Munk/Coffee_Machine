import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int correct = 1;
        int wrong1 = 2;
        int wrong2 = 3;
        int wrong3 = 4;
        int answer = scanner.nextInt();
        if (answer == correct) {
            System.out.println("Yes!");
        } else if (answer == wrong1 || answer == wrong2 || answer == wrong3) {
            System.out.println("No!");
        } else {
            System.out.println("Unknown number");
        }
    }
}