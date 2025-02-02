import java.util.Scanner;

public class Task5 {
    static final int ROWS = 5;
    static final int COLS = 5;
    static boolean[][] seats = new boolean[ROWS][COLS];
    
    public static void displaySeats() {
        System.out.println("\nAvailable Seats (A = Available, R = Reserved):");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (!seats[i][j]) {
                    System.out.print("[A] ");
                } else {
                    System.out.print("[R] ");
                }
            }
            System.out.println(); 
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n1. Display available seats");
            System.out.println("2. Reserve a seat");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt(); 
            
            switch (choice) {
                case 1:
                    displaySeats();
                    break;
                
                case 2:
                    System.out.print("Enter row number (0 to " + (ROWS - 1) + "): ");
                    int row = scanner.nextInt();
                    System.out.print("Enter column number (0 to " + (COLS - 1) + "): ");
                    int col = scanner.nextInt();
                    
                    if (row < 0 || row >= ROWS || col < 0 || col >= COLS) {
                        System.out.println("Invalid range! Please enter valid row and column.");
                    } else {
                        if (seats[row][col]) {
                            System.out.println("Sorry, the seat is already reserved.");
                        } else {
                            seats[row][col] = true;
                            System.out.println("Seat reserved successfully!");
                        }
                    }
                    break;
                
                case 3:
                    System.out.println("Exiting the system...");
                    break;
                
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 3.");
                    break;
            }
        } while (choice != 3); 
        
        scanner.close();
    }
}
