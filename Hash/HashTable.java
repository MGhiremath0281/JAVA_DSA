import java.util.*;

/**
 * -------------------------------------------------------------
 * MASTERING HASHSET AND HASHTABLE IN JAVA — BEGINNER TO ADVANCED
 * -------------------------------------------------------------
 * Author: Muktananda Hiremath
 * Purpose: A comprehensive guide to mastering HashSet and Hashtable in Java.
 * Level: Beginner to Advanced
 */

public class HashTable{

    public static void main(String[] args) {

        /**
         * =============================================================
         * 1. HASHSET IN JAVA
         * =============================================================
         * HashSet is part of the Java Collection Framework.
         * - Stores **unique elements** only.
         * - Does not maintain any order of elements (unordered collection).
         * - Internally uses **HashMap** to store elements.
         * - **Set** implementation (doesn't allow duplicate values).
         * - Performance: Average O(1) for add, remove, contains, etc.
         * 
         * Example Use Case:
         * - Storing unique elements like unique user IDs, product codes, etc.
         */

        System.out.println("=== HASHSET EXAMPLES ===");

        HashSet<String> set = new HashSet<>();

        // Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicate, ignored
        set.add("Orange");

        // Print the HashSet (order may vary)
        System.out.println("HashSet: " + set); // Output: [Banana, Orange, Apple] (order may vary)

        // Check presence
        System.out.println("Contains 'Apple'? " + set.contains("Apple")); // true

        // Remove element
        set.remove("Banana");

        // Size of the set
        System.out.println("Size: " + set.size()); // 2

        // Iterate over elements
        for (String fruit : set) {
            System.out.println("Element: " + fruit);
        }

        /**
         * -------------------------------------------------------------
         * Internally:
         * - HashSet uses a HashMap to store its elements.
         * - The elements are stored as the **key** of the map.
         * - The **value** is a dummy constant object (for example, `Boolean.TRUE`).
         * - Hashing ensures that the set only stores unique elements.
         * -------------------------------------------------------------
         */

        /**
         * =============================================================
         * 2. HASHTABLE IN JAVA
         * =============================================================
         * Hashtable is a legacy collection in Java.
         * - Stores **key-value pairs** like HashMap.
         * - **Thread-safe** (synchronized methods), making it slower than HashMap.
         * - **Does not allow null keys or null values**.
         * - Use **ConcurrentHashMap** in modern applications for thread-safety.
         * 
         * Example Use Case:
         * - Used in legacy systems where thread-safety is crucial.
         * 
         * Key points:
         * - Synchronized methods can cause performance bottlenecks.
         * - Lack of support for null keys and values is a limitation in some cases.
         */

        System.out.println("\n=== HASHTABLE EXAMPLES ===");

        Hashtable<String, Integer> table = new Hashtable<>();

        // Put entries
        table.put("A", 1);
        table.put("B", 2);
        table.put("C", 3);

        // table.put(null, 10); // ❌ Throws NullPointerException
        // table.put("D", null); // ❌ Also throws NullPointerException

        // Get value
        System.out.println("Value of 'B': " + table.get("B")); // 2

        // Remove a key
        table.remove("A");

        // Size of the table
        System.out.println("Size: " + table.size());

        // Iterate through the Hashtable entries
        for (Map.Entry<String, Integer> entry : table.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        /**
         * -------------------------------------------------------------
         * Internally:
         * - Like `HashMap`, it uses a **hashing mechanism** to store key-value pairs.
         * - **Thread-safe** because all methods are synchronized.
         * - Slower due to synchronization overhead.
         * - Does not support `null` keys or `null` values.
         * -------------------------------------------------------------
         */

        /**
         * =============================================================
         * 3. HASHSET vs HASHTABLE vs HASHMAP — COMPARISON
         * =============================================================
         * | Feature           | HashSet               | HashMap                | Hashtable            |
         * |-------------------|-----------------------|------------------------|----------------------|
         * | Stores            | Unique elements       | Key-Value pairs        | Key-Value pairs      |
         * | Null support      | Allows 1 null key     | Allows 1 null key, many null values | ❌ No nulls allowed  |
         * | Thread-safe       | ❌ Not thread-safe     | ❌ Not thread-safe      | ✅ Synchronized      |
         * | Order             | ❌ No order            | ❌ No order            | ❌ No order          |
         * | Performance       | Fast (O(1) avg time)   | Fast (O(1) avg time)   | Slower (due to sync) |
         * | Use Case          | Unique elements       | Key-value mapping      | Thread-safe mapping  |
         * | Backed by         | HashMap               | Native structure       | Native structure     |
         * | Modern Equivalent | `LinkedHashSet`, `TreeSet` | `ConcurrentHashMap`    | `ConcurrentHashMap`  |
         * 
         * -------------------------------------------------------------
         * When to use what:
         * - **HashSet**: Use when you only need a collection of unique elements, with no concern for order.
         * - **HashMap**: Use when you need a key-value mapping with fast lookups and updates (no synchronization).
         * - **Hashtable**: Use if you are working with legacy systems where thread-safety is crucial (but prefer `ConcurrentHashMap` in modern systems).
         * 
         * =============================================================
         * 4. COMMON USAGE SCENARIOS
         * =============================================================
         * 4.1 **HashSet Usage Example** — Storing Unique Usernames
         * ------------------------------------------------------------
         * HashSet is perfect for scenarios where you only care about unique elements, such as:
         * - Keeping track of usernames in a social network.
         * - Ensuring that there are no duplicate values in a collection.
         * 
         * Example:
         * ```java
         * HashSet<String> usernames = new HashSet<>();
         * usernames.add("user1");
         * usernames.add("user2");
         * usernames.add("user1"); // Duplicate, will be ignored.
         * ```
         * 
         * 4.2 **Hashtable Usage Example** — Thread-Safe Caching
         * ------------------------------------------------------
         * You might use a Hashtable in legacy systems where multiple threads are accessing a shared map. 
         * However, it's often better to use `ConcurrentHashMap` in modern Java.
         * 
         * Example:
         * ```java
         * Hashtable<String, Integer> cache = new Hashtable<>();
         * cache.put("key1", 100);
         * cache.put("key2", 200);
         * ```
         */

        /**
         * =============================================================
         * 5. THREAD SAFETY CONSIDERATIONS
         * =============================================================
         * - **Hashtable**: Thread-safe, but **slow** because every method is synchronized.
         * - **ConcurrentHashMap** (preferred over Hashtable): Thread-safe with better performance in multithreaded applications.
         * 
         * Example of using `ConcurrentHashMap`:
         * ```java
         * ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
         * concurrentMap.put("key1", 1);
         * ```
         * This class supports fine-grained locking, allowing threads to access independent segments of the map without locking the entire map.
         * -------------------------------------------------------------
         */
    }
}
