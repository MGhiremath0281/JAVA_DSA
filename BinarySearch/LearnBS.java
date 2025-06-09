// Binary Search Implementation in Java
// --------------------------------------------------------
// Definition:
// Binary Search is a fast search algorithm with a time complexity of O(log n).
// It works only on sorted arrays (either ascending or descending).
// The algorithm repeatedly divides the search interval in half.
// If the value of the target is less than the middle element, search in the left half.
// Otherwise, search in the right half.

class LearnBS {
    public static void main(String[] args) {

        // Sample sorted array - Binary search requires sorted data
        int[] arr = {2, 4, 7, 10, 23, 34, 45, 67};

        // Target element to search for
        int target = 23;

        // Call the binary search function
        int result = binarySearch(arr, target);

        // Display result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    // Function to perform binary search on a sorted array
    static int binarySearch(int[] arr, int target) {
        // Initialize the start and end pointers
        int start = 0;
        int end = arr.length - 1;

        // Loop continues as long as the search space is valid
        while (start <= end) {

            // Important Note:
            // To avoid potential integer overflow in languages like Java,
            // use this formula instead of (start + end) / 2
            int mid = start + (end - start) / 2;

            // If the target is less than the middle element,
            // it must be in the left half of the array
            if (target < arr[mid]) {
                end = mid - 1;
            }

            // If the target is greater than the middle element,
            // it must be in the right half of the array
            else if (target > arr[mid]) {
                start = mid + 1;
            }

            // If target is equal to the middle element, return the index
            else {
                return mid; // Found the target at index mid
            }
        }

        // If the loop ends, the target was not found
        return -1;
    }
}
