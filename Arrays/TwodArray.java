package Arrays;

import java.util.Scanner;

public class TwodArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // -------------------- 1. Basic 2D Array Declaration --------------------
        /*
            2D arrays = array of arrays (Matrix-like structure)
            Example:
                1 2 3
                4 5 6
                7 8 9
        */
        int[][] arr1 = new int[3][3]; // 3 rows, 3 columns - initialized with 0s

        // -------------------- 2. 2D Array Initialization with Values --------------------
        int[][] arr2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // -------------------- 3. Jagged Arrays (Variable column sizes) --------------------
        // You can define rows and assign columns later
        int[][] jagged = new int[3][];
        jagged[0] = new int[]{1, 2, 3};
        jagged[1] = new int[]{4, 5};
        jagged[2] = new int[]{6, 7, 8, 4};

        // Another way to declare a jagged array directly
        int[][] jagged2 = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 4}
        };

        // -------------------- 4. Taking Input in 2D Array --------------------
        int[][] arr = new int[3][4]; // 3 rows and 4 columns
        System.out.println("Enter 12 integers (3 rows x 4 cols):");

        for (int row = 0; row < arr.length; row++) {
            // arr.length gives number of rows
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        // -------------------- 5. Printing 2D Array --------------------
        System.out.println("2D Array Elements:");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(); // Move to next line after each row
        }

        // Optional: Using Arrays.toString for each row
        System.out.println("Using Arrays.toString for each row:");
        for (int[] row : arr) {
            System.out.println(java.util.Arrays.toString(row));
        }

        sc.close(); // Close scanner to prevent resource leak
    }
}
 