public class LinkdHashsetLearn {

    public static void main(String[] args) {
        // Create a LinkedHashSet
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        // 1. Add elements to the LinkedHashSet
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        System.out.println("[1] Added elements (10, 20, 30): " + linkedHashSet);

        // 2. Check if an element exists
        boolean contains20 = linkedHashSet.contains(20);
        System.out.println("[2] Does the LinkedHashSet contain '20'? " + contains20);

        // 3. Remove an element
        linkedHashSet.remove(20);
        System.out.println("[3] Removed element '20': " + linkedHashSet);

        // 4. Check size of the LinkedHashSet
        int size = linkedHashSet.size();
        System.out.println("[4] Size of LinkedHashSet: " + size);

        // 5. Check if the LinkedHashSet is empty
        boolean isEmpty = linkedHashSet.isEmpty();
        System.out.println("[5] Is LinkedHashSet empty? " + isEmpty);

        // 6. Clear the LinkedHashSet
        linkedHashSet.clear();
        System.out.println("[6] LinkedHashSet cleared. Current LinkedHashSet: " + linkedHashSet);

        // 7. Add more elements
        linkedHashSet.add(100);
        linkedHashSet.add(200);
        System.out.println("[7] Added more elements (100, 200): " + linkedHashSet);

        // 8. Iterate over the LinkedHashSet elements
        System.out.println("[8] Iterating over LinkedHashSet elements:");
        for (Integer element : linkedHashSet) {
            System.out.println("Element: " + element);
        }
        // 9. Convert LinkedHashSet to array
        Integer[] array = linkedHashSet.toArray(new Integer[0]);
        System.out.println("[9] Converted LinkedHashSet to array: " + java.util.Arrays.toString(array));
        // 10. Check the order of elements
        System.out.println("[10] The order of elements in LinkedHashSet is maintained as insertion order.");
        // 11. Check if LinkedHashSet allows null values
        linkedHashSet.add(null);
        System.out.println("[11] Added null value to LinkedHashSet: " + linkedHashSet);
        // 12. Check if LinkedHashSet allows duplicate values
        linkedHashSet.add(100); // Adding duplicate
        System.out.println("[12] Added duplicate value '100' to LinkedHashSet: " + linkedHashSet);
        // 13. Check if LinkedHashSet maintains insertion order
        System.out.println("[13] The LinkedHashSet maintains the insertion order of elements.");
        // 14. Check if LinkedHashSet is synchronized       
    }
}