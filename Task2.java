import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integer values:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter value for index " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        System.out.print("Multiples of 4 in the array: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 4 == 0) {
                System.out.print(arr[i] + " ");
                sum += arr[i];
            }
        }

        System.out.println("\nSum of multiples of 4: " + sum);

        scanner.close();
    }
}
