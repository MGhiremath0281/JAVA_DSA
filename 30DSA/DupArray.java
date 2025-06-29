import java.util.*;

public class DupArray {
    public static void main(String[] args) {
        // Original array with duplicate values
        int[] arr = {1, 3, 5, 4, 2, 6, 7, 8, 3, 2, 1, 2};

        // Use LinkedHashSet to maintain insertion order and remove duplicates
        Set<Integer> uniqueElements = new LinkedHashSet<>();

        // Add all elements to the set
        for (int num : arr) {
            uniqueElements.add(num);
        }

        // Print the result
        System.out.println("Array after removing duplicates:");
        System.out.println(uniqueElements);
    }
}
