/**
 * Program to find the minimum value in an integer array using Linear Search.
 * Linear Search is a simple algorithm that checks each element in the array 
 * one by one to find the desired value. Here, we use it to find the smallest number.
 */
public class Question3{

    /**
     * Finds and returns the minimum element in the given array.
     *
     * @param arr the input array of integers
     * @return the smallest element in the array, or -1 if the array is empty
     */
    static int findMinimum(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return -1; // You can throw an exception instead if required
        }

        // Assume the first element is the minimum
        int min = arr[0];

        // Traverse the array starting from index 1
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update if a smaller value is found
            }
        }

        return min;
    }

    /**
     * The main method to run the program.
     * Demonstrates the findMinimum function with a sample array.
     */
    public static void main(String[] args) {
        int[] nums = {8, 3, 1, 5, 9}; // Sample input array
        int result = findMinimum(nums);
        System.out.println("Minimum value in the array: " + result);
    }
}
