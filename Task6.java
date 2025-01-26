import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        String result = (age >= 18) ? "You are eligible to vote." : "You are not eligible to vote.";

        System.out.println(result);

        scanner.close();
    }
}
