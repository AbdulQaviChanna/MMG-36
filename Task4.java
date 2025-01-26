import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String[] names = new String[6];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 6 names:");
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name for position " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        boolean found = false;
        for (String name : names) {
            if (name.equalsIgnoreCase("Ali")) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("\"Ali\" is present in the array.");
        } else {
            System.out.println("\"Ali\" is not present in the array.");
        }

        scanner.close();
    }
}
