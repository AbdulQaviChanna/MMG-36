public class Task4 {
    
    public static void main(String[] args) {
        
        int[] array = new int[10];
        int i = 0;
        
        do {
            array[i] = (i + 1) * (i + 1);  
            i++;
        } while (i < array.length);

        System.out.print("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        int sumOfOdds = 0;
        int index = 0;
        
        while (index < array.length) {
            int currentNumber = array[index];
            
            if (currentNumber % 2 != 0) {
                sumOfOdds += currentNumber;  
            }
            if (currentNumber == 81) {
                break;  
            }

            index++;
        }

        System.out.println("Sum of odd numbers (up to 81): " + sumOfOdds);
    }
}
