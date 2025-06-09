import java.util.Arrays;
public class ArrayClassLearn {
// This class demonstrates various operations on arrays in Java
// including accessing elements, modifying, iterating, searching, and copying.
// Arrays in Java are fixed in size, meaning once created, their length cannot be changed.
// Arrays can hold primitive types or objects, and they are zero-indexed.
// The operations shown here include:     
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        System.out.println("== Array Operations Demo ==");
        // 1. Print the original array
        System.out.println("[1] Original array: " + Arrays.toString(array));
        // 2. Access elements by index
        System.out.println("[2] Element at index 2: " + array[2]);
        // 3. Modify an element
        array[2] = 99;
        System.out.println("[3] Modified element at index 2: " + Arrays.toString(array));
        // 4. Get the length of the array
        int length = array.length;
        System.out.println("[4] Length of the array: " + length);
        // 5. Iterate over the array elements
        System.out.println("[5] Iterating over array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index " + i + ": " + array[i]);
        }
        // 6. Convert array to a string
        String arrayString = Arrays.toString(array);
        System.out.println("[6] Array as string: " + arrayString);
        // 7. Check if the array contains a specific value
        int searchValue = 20;
        boolean containsValue = false;
        for (int value : array) {
            if (value == searchValue) {
                containsValue = true;
                break;
            }
        }
        System.out.println("[7] Does the array contain " + searchValue + "? " + containsValue);
        //binary search
        Arrays.sort(array); // Ensure the array is sorted for binary search
        int index = Arrays.binarySearch(array, searchValue);
        if (index >= 0) {
            System.out.println("[8] Value " + searchValue + " found at index: " + index);
        } else {
            System.out.println("[8] Value " + searchValue + " not found in the array.");
        }
        // 8. Copy the array to a new array
        int[] copiedArray = Arrays.copyOf(array, array.length);
        System.out.println("[9] Copied array: " + Arrays.toString(copiedArray));
        // 9. Fill the array with a specific value
        Arrays.fill(array, 0);
        System.out.println("[10] Array after filling with 0: " + Arrays.toString(array));
        // 10. Check if the array is empty
        boolean isEmpty = array.length == 0;
        System.out.println("[11] Is the array empty? " + isEmpty);
    }
}
