import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        draw();
    }
    public static void draw(){
        String string = "*";
        System.out.println("Enter the number of *");
        int number = scanner.nextInt();
        scanner.nextLine();
        for(int i = 1; i < number; i++){
            string += "*";

        }
        System.out.println(string);
    }
}
