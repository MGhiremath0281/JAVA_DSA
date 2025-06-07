import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * ArrayList Operations in Java
 * ----------------------------
 * This program demonstrates how to:
 * - Declare and initialize an ArrayList
 * - Add, update, remove, and access elements
 * - Check size and existence of elements
 * - Sort and clear the list
 * - Take user input and iterate over elements
 */
public class ArrayListsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("== ArrayList Operations Demo ==");

        // --------------------------------------
        // 1. Declare and Initialize ArrayList
        // --------------------------------------
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("\n[1] Initial empty list created.");

        // --------------------------------------
        // 2. Adding elements to the list
        // --------------------------------------
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("[2] Added elements (10, 20, 30): " + list);

        // --------------------------------------
        // 3. Insert element at a specific index
        // --------------------------------------
        list.add(1, 15); // Inserts 15 at index 1
        System.out.println("[3] Inserted 15 at index 1: " + list);

        // --------------------------------------
        // 4. Access element at a specific index
        // --------------------------------------
        System.out.println("[4] Element at index 2: " + list.get(2));

        // --------------------------------------
        // 5. Replace element at a specific index
        // --------------------------------------
        list.set(2, 25); // Replace value at index 2 with 25
        System.out.println("[5] Replaced index 2 with 25: " + list);

        // --------------------------------------
        // 6. Remove element at a specific index
        // --------------------------------------
        list.remove(3); // Removes element at index 3
        System.out.println("[6] Removed element at index 3: " + list);

        // --------------------------------------
        // 7. Check if a value exists in the list
        // --------------------------------------
        boolean contains20 = list.contains(20);
        System.out.println("[7] Does the list contain 20? " + contains20);

        // --------------------------------------
        // 8. Get the size of the list
        // --------------------------------------
        System.out.println("[8] Current size of list: " + list.size());

        // --------------------------------------
        // 9. Iterate using standard for loop
        // --------------------------------------
        System.out.println("[9] Iterating with index-based loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("  Index " + i + ": " + list.get(i));
        }

        // --------------------------------------
        // 10. Iterate using enhanced for-each loop
        // --------------------------------------
        System.out.println("[10] Iterating with for-each loop:");
        for (int num : list) {
            System.out.print("  " + num);
        }
        System.out.println();

        // --------------------------------------
        // 11. Sort the ArrayList
        // --------------------------------------
        Collections.sort(list);
        System.out.println("[11] Sorted list: " + list);

        // --------------------------------------
        // 12. User Input for New ArrayList
        // --------------------------------------
        System.out.println("[12] Enter 5 numbers to add to a new ArrayList:");
        ArrayList<Integer> inputList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("  Enter number " + (i + 1) + ": ");
            inputList.add(sc.nextInt());
        }
        System.out.println("  User input list: " + inputList);

        // --------------------------------------
        // 13. Clear the user-input list
        // --------------------------------------
        inputList.clear();
        System.out.println("[13] Cleared user input list: " + inputList);

        // Closing the scanner
        sc.close();

        System.out.println("\n== End of Demo ==");
        // --------------------------------------
        // 14. Iterate using Iterator
        // --------------------------------------
        Iterator<Integer> iterator = list.iterator();
        while (it.hasNext()) {
            System.out.println("Iterating through list: " + iterator.next());
            
        }
    }
}
