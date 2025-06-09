import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class LearncollectionClass {
    public static void main(String[] args) {
        // Create a collection
        Collection<String> collection = new ArrayList<>();

        // 1. Add elements to the collection
        collection.add("Apple");
        collection.add("Banana");
        collection.add("Cherry");
        System.out.println("[1] Added elements (Apple, Banana, Cherry): " + collection);

        // 2. Check if an element exists
        boolean containsBanana = collection.contains("Banana");
        System.out.println("[2] Does the collection contain 'Banana'? " + containsBanana);

        // 3. Remove an element
        collection.remove("Banana");
        System.out.println("[3] Removed element 'Banana': " + collection);

        // 4. Check size of the collection
        int size = collection.size();
        System.out.println("[4] Size of collection: " + size);

        // 5. Check if the collection is empty
        boolean isEmpty = collection.isEmpty();
        System.out.println("[5] Is collection empty? " + isEmpty);

        // 6. Clear the collection
        collection.clear();
        System.out.println("[6] Collection cleared. Current collection: " + collection);

        // 7. Add more elements
        collection.add("Mango");
        collection.add("Orange");
        System.out.println("[7] Added more elements (Mango, Orange): " + collection);

        // 8. Iterate over the collection elements
        System.out.println("[8] Iterating over collection elements:");
        for (String element : collection) {
            System.out.println("Element: " + element);
        }

        // 9. Convert collection to array
        String[] array = collection.toArray(new String[0]);
        System.out.println("[9] Converted collection to array: " + java.util.Arrays.toString(array));
        
        //Check Min and Max and frequency of elements
                // 10. Check min and max elements
        String min = Collections.min(collection);
        String max = Collections.max(collection);
        System.out.println("[10] Minimum element: " + min);
        System.out.println("[10] Maximum element: " + max);

        // 11. Frequency of a particular element
        int freqMango = Collections.frequency(collection, "Mango");
        System.out.println("[11] Frequency of 'Mango': " + freqMango);
        // 12. Check if the collection contains all elements of another collection
        Collection<String> anotherCollection = new ArrayList<>();
        anotherCollection.add("Mango");
        anotherCollection.add("Orange");
        boolean containsAll = collection.containsAll(anotherCollection);    
        
    }
}
