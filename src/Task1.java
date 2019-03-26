import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        String numberBynary = scanner.nextLine();
        int number = Integer.parseInt(numberBynary, 2);
        System.out.println(numberBynary + "->" + number);
    }
}
