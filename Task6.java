import java.util.Scanner;

public class CurrencyConverter.java {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ENTER THE VALUE IN DOLLARS: ");
        
        
        if (scanner.hasNextDouble()) {
            double dollars = scanner.nextDouble();
        
            double dollarsToRupeesRate = 280.71;
        
         
            double rupees = dollars * dollarsToRupeesRate;
        
          
            System.out.println("Value in rupees: " + rupees);
        } else {
            System.out.println("Invalid input! Please enter a valid numeric value for dollars.");
        }
        
        scanner.close();
    }
}
