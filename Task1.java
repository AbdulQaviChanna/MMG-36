import java.util.Scanner;
cmd

public class Task1 {
    public static void main(String[] args) {
        char[] const_arr = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char user_inp = scanner.next().charAt(0);

       
        boolean isConsonant = false;

       
        for (char c : const_arr) {
            if (c == user_inp) {
                isConsonant = true;
                break;
            }
        }

       
        if (isConsonant) {
            System.out.println(user_inp + " is a consonant.");
        } else {
            System.out.println(user_inp + " is not a consonant.");
        }

        scanner.close();
    }
}
