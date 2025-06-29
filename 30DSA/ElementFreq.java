import java.util.HashMap;
import java.util.Map;

public class ElementFreq{

    /**
     * Counts the frequency of each element in a given integer array.
     *
     * @param arr An array of integers.
     * @return A Map where keys are the elements and values are their frequencies.
     */
    public static Map<Integer, Integer> countElementFrequency(int[] arr) {
        // Using HashMap to store element -> frequency mapping
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        if (arr == null || arr.length == 0) {
            return frequencyMap; // Return an empty map for null or empty arrays
        }

        for (int element : arr) {
            // Get the current count for the element, default to 0 if not present
            // Then increment the count and put it back
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }
        return frequencyMap;
    }

    /**
     * Counts the frequency of each element in a given generic array.
     * This version works for any Object type (String, Character, etc.).
     *
     * @param <T> The type of elements in the array.
     * @param arr An array of type T.
     * @return A Map where keys are the elements and values are their frequencies.
     */
    public static <T> Map<T, Integer> countElementFrequencyGeneric(T[] arr) {
        Map<T, Integer> frequencyMap = new HashMap<>();

        if (arr == null || arr.length == 0) {
            return frequencyMap;
        }

        for (T element : arr) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }
        return frequencyMap;
    }


    public static void main(String[] args) {
        // Test cases for integer array
        int[] arr1 = {1, 2, 2, 3, 1, 4, 2};
        System.out.println("Frequency of elements in [1, 2, 2, 3, 1, 4, 2]: " + countElementFrequency(arr1));

        int[] arr2 = {};
        System.out.println("Frequency of elements in []: " + countElementFrequency(arr2));

        int[] arr3 = {5, 5, 5, 5};
        System.out.println("Frequency of elements in [5, 5, 5, 5]: " + countElementFrequency(arr3));

        // Test cases for generic array (e.g., String array)
        String[] arr4 = {"a", "b", "a", "c", "b", "a"};
        System.out.println("Frequency of elements in [\"a\", \"b\", \"a\", \"c\", \"b\", \"a\"]: " + countElementFrequencyGeneric(arr4));
        
        Character[] arr5 = {'x', 'y', 'x', 'z'};
        System.out.println("Frequency of elements in ['x', 'y', 'x', 'z']: " + countElementFrequencyGeneric(arr5));
    }
}

/*
 * import java.util.HashMap;
import java.util.Map; // Import the Map interface
import java.util.Arrays; // Useful for printing arrays directly

public class SimpleFrequencyCounter {

    public static void main(String[] args) {
        // 1. Define an array of numbers
        int[] numbers = {10, 20, 10, 30, 20, 10, 40, 50, 40};
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // 2. Create a HashMap to store frequencies
        // Key: The number itself
        // Value: The count of that number
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // 3. Iterate through the array
        for (int number : numbers) {
            // 4. Update its count in the HashMap
            // getOrDefault(key, defaultValue)
            // - If 'number' is already in the map, get its current count.
            // - If 'number' is NOT in the map, use 0 as the default count.
            // Then, add 1 to that count and put it back into the map for 'number'.
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        // 5. Print the final frequencies
        System.out.println("Element Frequencies:");
        // Iterate through the entries in the map to print key-value pairs
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("  " + entry.getKey() + " appears " + entry.getValue() + " times.");
        }
    }
}
 */