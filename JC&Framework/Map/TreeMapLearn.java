import java.util.TreeMap;
//     Integer[] array = deque.toArray(new Integer[0]);
import java.util.Map;
//Different from HashMap, TreeMap is sorted by keys in natural order or by a custom comparator.
// TreeMap does not allow null keys but allows null values.
// TreeMap is not synchronized, so it is not thread-safe.
// TreeMap provides O(log n) time complexity for basic operations like add, remove, and contains.
// TreeMap is implemented as a Red-Black tree, which is a self-balancing binary search tree.
// TreeMap is useful when you need a sorted map or when you need to maintain the order of keys.
// O(log n) time complexity for add, remove, and contains operations in TreeMap
// TreeMap is part of the Java Collections Framework and implements the Map interface.
public class TreeMapLearn {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();
        // 1. Add elements to the TreeMap
        treeMap.put(3, "Three");    
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        System.out.println("[1] Added elements (3: Three, 1: One, 2: Two): " + treeMap);
        // 2. Check if a key exists
        boolean containsKey2 = treeMap.containsKey(2);
        System.out.println("[2] Does the TreeMap contain key '2'? " + containsKey2);
        // 3. Get value by key
        String valueForKey1 = treeMap.get(1);
        System.out.println("[3] Value for key '1': " + valueForKey1);
        // 4. Remove an element by key
        treeMap.remove(2);
        System.out.println("[4] Removed element with key '2': " + treeMap);
        // 5. Check size of the TreeMap
        int size = treeMap.size();
        System.out.println("[5] Size of TreeMap: " + size);
        // 6. Check if the TreeMap is empty
        boolean isEmpty = treeMap.isEmpty();
        System.out.println("[6] Is TreeMap empty? " + isEmpty);
        // 7. Clear the TreeMap     
        treeMap.clear();
        System.out.println("[7] TreeMap cleared. Current TreeMap: " + treeMap);
        // 8. Add more elements
        treeMap.put(100, "Hundred");
        treeMap.put(200, "Two Hundred");
        System.out.println("[8] Added more elements (100: Hundred, 200: Two Hundred): " + treeMap);
        // 9. Iterate over the TreeMap entries  
        System.out.println("[9] Iterating over TreeMap entries:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        // 10. Convert TreeMap keys to array
        Integer[] keysArray = treeMap.keySet().toArray(new Integer[0]);
        System.out.println("[10] Converted TreeMap keys to array: " + java.util.Arrays.toString(keysArray));
        // 11. Convert TreeMap values to array
        String[] valuesArray = treeMap.values().toArray(new String[0]);
        System.out.println("[11] Converted TreeMap values to array: " + java.util.Arrays.toString(valuesArray));
        // 12. Check the order of keys  
        System.out.println("[12] The order of keys in TreeMap is sorted in natural order.");
        // 13. Check if TreeMap allows null keys or values

        try {
            treeMap.put(null, "Null Key");
        } catch (NullPointerException e) {
            System.out.println("[13] TreeMap does not allow null keys.");
        }
        try {
            treeMap.put(1, null);
            System.out.println("[14] TreeMap allows null values for key '1': " + treeMap);
        } catch (NullPointerException e) {
            System.out.println("[14] TreeMap does not allow null values.");
        }
    }
}
