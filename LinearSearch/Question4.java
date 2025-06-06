import java.util.Arrays;

/**
 * Program to search for a target element in a 2D array using Linear Search.
 * Returns the index position of the target in the format [row, column].
 * If the element is not found, returns [-1, -1].
 */
public class Question4{

    public static void main(String[] args) {
        // Define a sample 2D array (matrix)
        int[][] matrix = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 11, 23, 13}
        };

        // Define the target value to be searched
        int target = 23;

        // Call the search function and store the result
        int[] result = searchTarget(matrix, target);

        // Print the result using Arrays.toString for readable format
        System.out.println("Target found at: " + Arrays.toString(result));
    }

    /**
     * Performs linear search on a 2D array to find the target value.
     * 
     * @param arr    The 2D array to be searched
     * @param target The value to search for
     * @return       An array containing [row, column] of target or [-1, -1] if not found
     */
    public static int[] searchTarget(int[][] arr, int target) {
        // Traverse through each row
        for (int row = 0; row < arr.length; row++) {
            // Traverse through each column in the current row
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    // Return the position as soon as the target is found
                    return new int[] { row, col };
                }
            }
        }

        // If target is not found, return [-1, -1]
        return new int[] { -1, -1 };
    }
}
