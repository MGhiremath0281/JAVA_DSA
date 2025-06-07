import java.util.*;
/**
 * -------------------------------------------------------------
 * MASTERING HASHMAP IN JAVA — BEGINNER TO ADVANCED
 * -------------------------------------------------------------
 * Author: Muktananda Hiremath
 * Purpose: A glorified guide to mastering HashMap in Java.
 * Level: Beginner to Advanced
 */

public class HashmapMastry {
    public static void main(String[] args) {

        /**
         * -------------------------------------------------------------
         * 1. BASIC DECLARATION & INITIALIZATION
         * -------------------------------------------------------------
         * Syntax: HashMap<KeyType, ValueType> mapName = new HashMap<>();
         * Stores unique keys with associated values.
         */

        HashMap<String, Integer> map = new HashMap<>();

        // Insert key-value pairs using put()
        map.put("Apple", 10);
        map.put("Banana", 5);
        map.put("Mango", 7);

        // Retrieve value for a key using get()
        System.out.println("Apple count: " + map.get("Apple")); // Output: 10

        // Update value
        map.put("Apple", 15);

        // Check key/value presence
        System.out.println("Contains 'Banana'? " + map.containsKey("Banana")); // true
        System.out.println("Contains value 7? " + map.containsValue(7)); // true

        // Remove a key
        map.remove("Banana");

        // Get size of the map
        System.out.println("Map Size: " + map.size()); // 2

        /**
         * -------------------------------------------------------------
         * 2. ITERATION METHODS
         * -------------------------------------------------------------
         */

        // Method 1: Using entrySet()
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Method 2: Iterating keys
        for (String key : map.keySet()) {
            System.out.println("Key: " + key);
        }

        // Method 3: Iterating values
        for (Integer val : map.values()) {
            System.out.println("Value: " + val);
        }

        /**
         * -------------------------------------------------------------
         * 3. FREQUENCY COUNT PATTERN (Important in Interviews)
         * -------------------------------------------------------------
         */

        int[] nums = {1, 2, 2, 3, 3, 3};
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        System.out.println("Frequency Map: " + freq); // {1=1, 2=2, 3=3}

        /**
         * -------------------------------------------------------------
         * 4. ADVANCED METHODS
         * -------------------------------------------------------------
         */

        // putIfAbsent(): Only inserts if key is not already present
        map.putIfAbsent("Orange", 12);
        map.putIfAbsent("Apple", 100); // Won't override

        // computeIfAbsent(): Useful for maps of lists or sets
        HashMap<String, List<Integer>> listMap = new HashMap<>();
        listMap.computeIfAbsent("A", k -> new ArrayList<>()).add(10);

        // merge(): Add or update with logic
        map.merge("Mango", 3, Integer::sum); // 7 + 3 = 10

        System.out.println("After advanced ops: " + map);

        /**
         * -------------------------------------------------------------
         * 5. INTERVIEW PATTERN — TWO SUM USING HASHMAP
         * -------------------------------------------------------------
         */

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> idxMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (idxMap.containsKey(complement)) {
                System.out.println("Two Sum Indices: [" + idxMap.get(complement) + ", " + i + "]");
            }
            idxMap.put(arr[i], i);
        }

        /**
         * -------------------------------------------------------------
         * 6. INTERNAL WORKING OF HASHMAP & hashCode()
         * -------------------------------------------------------------
         * - HashMap uses an array of buckets internally (Entry[] table).
         * - Each key's `hashCode()` is computed → hashed → mapped to an index.
         * - If two keys have the same index → collision handled by:
         *   - Separate chaining (LinkedList)
         *   - Tree structure (since Java 8) if entries in a bucket > 8
         * - Java uses both `hashCode()` and `equals()` to ensure uniqueness.
         */

        String key1 = "FB";
        String key2 = "Ea";

        // ⚠️ Both produce the same hashCode() in Java (common interview trick)
        System.out.println("FB hashCode: " + key1.hashCode());
        System.out.println("Ea hashCode: " + key2.hashCode());

        HashMap<String, String> collisionMap = new HashMap<>();
        collisionMap.put("FB", "Value1");
        collisionMap.put("Ea", "Value2"); // Both go to the same bucket internally

        System.out.println("Collision Map: " + collisionMap);

        /**
         * -------------------------------------------------------------
         * 7. CUSTOM OBJECTS AS HASHMAP KEYS — Override hashCode & equals
         * -------------------------------------------------------------
         * Best Practice: Always override both `equals()` and `hashCode()`
         * if you use custom objects as keys.
         */

        HashMap<Student, String> studentMap = new HashMap<>();
        studentMap.put(new Student("Muttu", 101), "Kalburgi");

        // Should print "Kalburgi" if equals/hashCode are overridden correctly
        System.out.println("Student Map Lookup: " +
            studentMap.get(new Student("Muttu", 101)));

        /**
         * -------------------------------------------------------------
         * 8. IMPORTANT VARIANTS OF HASHMAP
         * -------------------------------------------------------------
         * - LinkedHashMap: maintains insertion order
         * - TreeMap: keys sorted in natural order
         * - ConcurrentHashMap: thread-safe version for multi-threading
         */

        LinkedHashMap<String, Integer> linkedMap = new LinkedHashMap<>();
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        linkedMap.put("C", 3);
        linkedMap.put("A", 1);
        linkedMap.put("B", 2);

        treeMap.put("C", 3);
        treeMap.put("A", 1);
        treeMap.put("B", 2);

        System.out.println("LinkedHashMap: " + linkedMap); // Maintains insertion order
        System.out.println("TreeMap: " + treeMap);         // Sorted by keys

        /**
         * -------------------------------------------------------------
         * 9. BEST PRACTICES
         * -------------------------------------------------------------
         * - Avoid using null keys in critical logic (HashMap allows 1 null key)
         * - Avoid mutable keys: If key values change, hashCode breaks
         * - Prefer using compute(), merge(), getOrDefault() for clean code
         * - Use appropriate initial capacity if map size is known
         */
    }
}

/**
 * -------------------------------------------------------------
 * CUSTOM CLASS FOR HASHMAP KEY — Student
 * -------------------------------------------------------------
 * Demonstrates overriding hashCode() and equals()
 */

class Student {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Override hashCode using Java's Objects.hash utility
    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    // Override equals for logical equality
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        return id == other.id && Objects.equals(name, other.name);
    }
}
