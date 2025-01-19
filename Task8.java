import java.util.Scanner;

public class SpeedConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter speed in miles per hour (mph): ");
        double milesPerHour = scanner.nextDouble();

        double kilometersPerHour = milesPerHour * 1.60934;

        System.out.printf("Equivalent speed in kilometers per hour: %.2f km/h\n", kilometersPerHour);

        scanner.close();
    }
}
