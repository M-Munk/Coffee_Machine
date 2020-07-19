import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int segmentLength = scanner.nextInt();
        int segmentWidth = scanner.nextInt();
        int numberSegmentsToBreak = scanner.nextInt();
        int remainder = numberSegmentsToBreak % (segmentLength * segmentWidth);
        if (numberSegmentsToBreak > segmentLength * segmentWidth) {
            System.out.println("NO");
        } else if (remainder % segmentLength == 0 || remainder % segmentWidth == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}