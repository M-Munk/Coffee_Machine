import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String roomShape = scanner.next();
        double area = 0;
        switch (roomShape) {
            case "triangle":
                float a = scanner.nextInt();
                float b = scanner.nextInt();
                float c = scanner.nextInt();
                float s = (a + b + c) / 2;
                area =  Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println(area);
                break;
            case "rectangle":
                int sidea = scanner.nextInt();
                int sideb = scanner.nextInt();
                area = sidea * sideb;
                System.out.println(area);
                break;
            case "circle":
                float r = scanner.nextInt();
                area =  3.14 * r * r;
                System.out.println(area);
                break;
            default:
                break;

        }
    }
}
