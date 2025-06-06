import java.util.Arrays;

public class PassingFunctions {
    public static void main(String[] args) {
        // Initialize an integer array
        int[] nums = {3, 4, 5, 12};

        // Display the original array
        System.out.println("Original array: " + Arrays.toString(nums));

        // Pass the array to the method
        change(nums); // This will change the first element to 99

        // Display the array after modification
        System.out.println("Modified array: " + Arrays.toString(nums));
    }

    // ----------------------------
    // Function to modify the array
    // ----------------------------
    // This method receives a reference to the original array
    // Hence, any change inside will reflect outside as well
    static void change(int[] arr) {
        // Change the first element of the array
        arr[0] = 99;
    }
}
