class Cealing {
    public static void main(String[] args) {
        // Example usage:
        int[] arr1 = {2, 3, 5, 9, 14, 16, 18};
        int target1 = 15;
        System.out.println("Ceiling of " + target1 + " in arr1: " + ceiling(arr1, target1)); // Expected: 16 (index 5)

        int[] arr2 = {1, 2, 3, 4, 5};
        int target2 = 0;
        System.out.println("Ceiling of " + target2 + " in arr2: " + ceiling(arr2, target2)); // Expected: 1 (index 0)

        int[] arr3 = {1, 2, 3, 4, 5};
        int target3 = 5;
        System.out.println("Ceiling of " + target3 + " in arr3: " + ceiling(arr3, target3)); // Expected: 5 (index 4)

        int[] arr4 = {1, 2, 3, 4, 5};
        int target4 = 6;
        System.out.println("Ceiling of " + target4 + " in arr4: " + ceiling(arr4, target4)); // Expected: -1 (or handle out of bounds)
    }

    // This method should be static to be called from main without creating an object.
    // Also, it should be defined within the class, not inside main.
    static int ceiling(int[] arr, int target) {
        // If the target is greater than the largest element in the array,
        // there is no ceiling, so return -1 or throw an exception.
        // This is a common convention, or you might return arr.length if you
        // want to indicate insertion point for a new largest element.
        if (target > arr[arr.length - 1]) {
            return -1; // Or some other indicator for "not found"
        }

        int start = 0;
        int end = arr.length - 1; // Corrected 'lrngth' to 'length'

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) { // Corrected 'tarrget' to 'target'
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid]; // Return the element itself if found (or mid for index)
                                  // The problem statement implies returning the ceiling element, not its index.
                                  // If you want the index, return mid.
            }
        }
        // When the loop ends, 'start' will point to the smallest element
        // that is greater than or equal to the target. This is the ceiling.
        // If the target is smaller than the smallest element, start will be 0.
        return arr[start];
    }
}