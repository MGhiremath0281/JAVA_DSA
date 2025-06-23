class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        System.out.println("The ceiling of " + target + " is: " + ceiling(arr, target)); // Output: The ceiling of 15 is: 16

        int target2 = 1;
        System.out.println("The ceiling of " + target2 + " is: " + ceiling(arr, target2)); // Output: The ceiling of 1 is: 2

        int target3 = 18;
        System.out.println("The ceiling of " + target3 + " is: " + ceiling(arr, target3)); // Output: The ceiling of 18 is: 18

        int target4 = 20; // Target greater than the largest element
        System.out.println("The ceiling of " + target4 + " is: " + ceiling(arr, target4)); // Output: The ceiling of 20 is: -1
    }

    // Finds the ceiling of the target in a sorted array
    static int ceiling(int[] arr, int target) {
        // If the target is larger than the last element, there's no ceiling
        if (target > arr[arr.length - 1]) {
            return -1; // Or you could throw an exception, depending on requirements
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // Avoids potential integer overflow

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid]; // Target found, so it's its own ceiling
            }
        }
        // When the loop finishes, 'start' will be pointing to the ceiling element's index
        return arr[start];
    }
}