import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int grade = 0;
        int numStudent = scanner.nextInt();
        for (int i = 1; i<= numStudent; i++) {
            grade = scanner.nextInt();
            if (grade == 5) {
                a++;
            } else if (grade == 4) {
                b++;
            } else if (grade == 3) {
                c++;
            } else if (grade == 2) {
                d++;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}