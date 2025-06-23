// Order-Agnostic Binary Search in Java
// ------------------------------------------------------------
// What is Binary Search?
//    Binary Search is a powerful algorithm used to find the index of a target element
//    in a sorted array. It has a time complexity of O(log n) and works by repeatedly
//    dividing the search interval in half.

// What is Order-Agnostic Binary Search (OABS)?
//    Normally, binary search assumes the array is sorted in ascending order.
//    But OABS works on both ascending and descending sorted arrays by first detecting
//    the order and adjusting the comparison logic accordingly.

class LearnABS {
    public static void main(String[] args) {

        // Example array (you can change this to ascending or descending)
        // This is a descending sorted array
        int[] arr = {99, 85, 70, 50, 30, 10, 5};

        // Target element to search
        int target = 50;

        // Calling the Order-Agnostic Binary Search function
        int index = orderAgnosticBS(arr, target);

        // Output result
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    /**
     * Function: orderAgnosticBS
     * -------------------------
     * Searches for a target value in a sorted array (ascending or descending)
     * using binary search that adapts to the sort order.
     *
     * @param arr    The input sorted array
     * @param target The element to be searched
     * @return       Index of the target if found, else -1
     */
    static int orderAgnosticBS(int[] arr, int target) {

        // Initialize start and end pointers
        int start = 0;
        int end = arr.length - 1;

        // Step 1: Determine whether the array is sorted in ascending or descending order
        // This is done by comparing the first and last element
        boolean isAsc = arr[start] < arr[end];

        // Step 2: Perform Binary Search using loop
        while (start <= end) {
            // Safe way to calculate mid to avoid potential integer overflow
            int mid = start + (end - start) / 2;

            // Check if the target is found at mid
            if (arr[mid] == target) {
                return mid;
            }

            // Step 3: Comparison logic depends on sort order
            if (isAsc) {
                // Array is sorted in ascending order
                if (target < arr[mid]) {
                    end = mid - 1;  // Move to left half
                } else {
                    start = mid + 1;  // Move to right half
                }
            } else {
                // Array is sorted in descending order
                if (target > arr[mid]) {
                    end = mid - 1;  // Move to left half
                } else {
                    start = mid + 1;  // Move to right half
                }
            }
        }

        // Target was not found in the array
        return -1;
    }
}































































