public class HashsetLearn {
    //O(1) time complexity for add, remove, and contains operations in HashSet
    public static void main(String[] args) {
        // Create a HashSet
        Set<Integer> hashSet = new HashSet<>();
        
        // 1. Add elements to the HashSet
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        System.out.println("[1] Added elements (10, 20, 30): " + hashSet);
        
        // 2. Check if an element exists
        boolean contains20 = hashSet.contains(20);
        System.out.println("[2] Does the HashSet contain '20'? " + contains20);
        
        // 3. Remove an element
        hashSet.remove(20);
        System.out.println("[3] Removed element '20': " + hashSet);
        
        // 4. Check size of the HashSet
        int size = hashSet.size();
        System.out.println("[4] Size of HashSet: " + size);
        
        // 5. Check if the HashSet is empty
        boolean isEmpty = hashSet.isEmpty();
        System.out.println("[5] Is HashSet empty? " + isEmpty);
        
        // 6. Clear the HashSet
        hashSet.clear();
        System.out.println("[6] HashSet cleared. Current HashSet: " + hashSet);
        
        // 7. Add more elements
        hashSet.add(100);
        hashSet.add(200);
        System.out.println("[7] Added more elements (100, 200): " + hashSet);
        
        // 8. Iterate over the HashSet elements
        System.out.println("[8] Iterating over HashSet elements:");
        for (Integer element : hashSet) {
            System.out.println("Element: " + element);
        }
    }
}
