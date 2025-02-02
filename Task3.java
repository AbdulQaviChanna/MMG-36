public class Task3 {

    public static void main(String[] args) {
  
        int[][] matrix = {
            {12, 13, 15, 16},
            {11, 110, 121, 17},
            {17, 18, 100, 21}
        };

       
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    matrix[i][j] = matrix[i][j] / 2;  
                }
            }
        }

        System.out.println("Odd numbers in the updated matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {  
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println();  

        int sumOfUpdatedEvens = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {  
                    sumOfUpdatedEvens += matrix[i][j];  
                }
            }
        }

        System.out.println("Sum of updated even numbers: " + sumOfUpdatedEvens);
    }
}
