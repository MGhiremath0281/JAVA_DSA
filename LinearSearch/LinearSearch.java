/**
 * Linear Search Algorithm in Java
 * --------------------------------
 * Definition:
 * Linear Search is the simplest searching algorithm.
 * It checks every element of the array sequentially 
 * until the target element is found or the end of the array is reached.
 *
 * Time Complexity:
 * - Best Case: O(1)    → when the target is at the beginning
 * - Worst Case: O(n)   → when the target is at the end or not found
 * Space Complexity: O(1) → no extra memory used
 */

import java.util.Arrays;

public class LinearSearch {

    /**
     * 1 Basic Linear Search (Traditional For Loop)
     */
    static int linearSearch(int[] nums, int target) {
        if (nums.length == 0) return -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }

        return -1; // not found
    }

    /**
     * 2️ Linear Search using Enhanced For Loop (returns index)
     */
    static int linearSearchIndex(int[] nums, int target) {
        int index = 0;
        for (int element : nums) {
            if (element == target) return index;
            index++;
        }
        return -1;
    }

    /**
     * 3️ Linear Search using Enhanced For Loop (returns true/false)
     */
    static boolean linearSearchExists(int[] nums, int target) {
        for (int element : nums) {
            if (element == target) return true;
        }
        return false;
    }

    /**
     *  Main method – Entry point of the program
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 56, 14, 12};
        int target = 56;

        // Method 1: Using index return
        int index = linearSearch(nums, target);
        System.out.println(index != -1 
            ? "Target found at index: " + index 
            : "Target not found");

        // Method 2: Using enhanced for loop to get index
        int idx = linearSearchIndex(nums, target);
        System.out.println(idx != -1 
            ? "Enhanced loop: Target found at index " + idx 
            : "Enhanced loop: Target not found");

        // Method 3: Check existence only
        boolean exists = linearSearchExists(nums, target);
        System.out.println("Target exists? " + exists);
    }
}
