public class Dynamic{
    public static void main(String[] args) {
        // ------------------------
        // Jagged 2D Array Example
        // ------------------------
        int[][] arr = {
            {1, 2, 3, 4},   // Row 0 has 4 elements
            {5, 6},         // Row 1 has 2 elements
            {7, 8, 9}       // Row 2 has 3 elements
        };

        // ------------------------
        // Printing the 2D Array
        // ------------------------
        System.out.println("Jagged 2D Array Output:");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(); // move to next line after each row
        }
    }
}
 