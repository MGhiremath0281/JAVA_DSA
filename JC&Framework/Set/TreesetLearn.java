public class TreesetLearn {
//O(logn) time complexity for add, remove, and contains operations in TreeSet
    public static void main(String[] args) {
        // Create a TreeSet
        Set<Integer> treeSet = new java.util.TreeSet<>();

        // 1. Add elements to the TreeSet
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        System.out.println("[1] Added elements (30, 10, 20): " + treeSet);

        // 2. Check if an element exists
        boolean contains20 = treeSet.contains(20);
        System.out.println("[2] Does the TreeSet contain '20'? " + contains20);

        // 3. Remove an element
        treeSet.remove(20);
        System.out.println("[3] Removed element '20': " + treeSet);

        // 4. Check size of the TreeSet
        int size = treeSet.size();
        System.out.println("[4] Size of TreeSet: " + size);

        // 5. Check if the TreeSet is empty
        boolean isEmpty = treeSet.isEmpty();
        System.out.println("[5] Is TreeSet empty? " + isEmpty);

        // 6. Clear the TreeSet
        treeSet.clear();
        System.out.println("[6] TreeSet cleared. Current TreeSet: " + treeSet);

        // 7. Add more elements
        treeSet.add(100);
        treeSet.add(200);
        System.out.println("[7] Added more elements (100, 200): " + treeSet);

        // 8. Iterate over the TreeSet elements
        System.out.println("[8] Iterating over TreeSet elements:");
        for (Integer element : treeSet) {
            System.out.println("Element: " + element);
        }

        // 9. Convert TreeSet to array
        Integer[] array = treeSet.toArray(new Integer[0]);
        System.out.println("[9] Converted TreeSet to array: " + java.util.Arrays.toString(array));

        // 10. Check the order of elements
        System.out.println("[10] The order of elements in TreeSet is sorted in natural order.");

    }
    // Note: TreeSet does not allow null values and does not allow duplicate values.
    // It also maintains a sorted order of elements based on their natural ordering or a custom comparator.
    // TreeSet is not synchronized, so it is not thread-safe.   
}