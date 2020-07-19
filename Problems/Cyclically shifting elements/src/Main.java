import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < a; i++) {
            array[i] = scanner.nextInt();
        }
        int[] arrayShift = new int[a];
        if ((a - 1) >= 0) {
            System.arraycopy(array, 0, arrayShift, 1, a - 1);
        }
        arrayShift[0] = array[a - 1];
        for (int element: arrayShift) {
            System.out.print(element + " ");
        }
    }
}