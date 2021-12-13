import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        draw();
    }
    public static void draw() {
        int count = 0;
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < number; i++) {
            count++;
            for (int j = 0; j < number; j++) {
                System.out.print(count);
            }
            System.out.println("\n");
        }
    }
}
