public class StringBuilderGuide {
    public static void main(String[] args) {
        
        // ----------------------------------------
        // 1. Definition and Basic Concept
        // ----------------------------------------
        // StringBuilder in Java is a mutable sequence of characters.
        // Unlike String, which is immutable, StringBuilder allows modification of the sequence without creating new objects.
        // It is more efficient for string manipulation as it doesn't create new objects for each change.
        
        // StringBuilder is used when you need to perform many string manipulations.
        // Since it is mutable, it changes its internal buffer as needed, leading to better performance.

        // Example:
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Initial StringBuilder: " + sb);
        
        // ----------------------------------------
        // 2. Key Methods of StringBuilder
        // ----------------------------------------
        
        // 2.1. append()
        // The append() method adds the specified string to the end of the current StringBuilder.
        sb.append(" World");
        // StringBuilder now holds: "Hello World"
        System.out.println("After append: " + sb);

        // 2.2. insert()
        // The insert() method inserts the specified string at the specified position (index).
        sb.insert(5, ",");
        // StringBuilder now holds: "Hello, World"
        System.out.println("After insert: " + sb);

        // 2.3. delete()
        // The delete() method removes characters between the specified start index (inclusive) and end index (exclusive).
        sb.delete(5, 6);  // Removes the comma at index 5
        // StringBuilder now holds: "Hello World"
        System.out.println("After delete: " + sb);

        // 2.4. deleteCharAt()
        // The deleteCharAt() method removes the character at the specified index.
        sb.deleteCharAt(5);
        // StringBuilder now holds: "HelloWord"
        System.out.println("After deleteCharAt: " + sb);

        // 2.5. reverse()
        // The reverse() method reverses the characters of the StringBuilder in-place.
        sb.reverse();
        // StringBuilder now holds: "droWolleH"
        System.out.println("After reverse: " + sb);

        // 2.6. toString()
        // The toString() method converts the StringBuilder into a regular String.
        String str = sb.toString();
        // String now holds: "droWolleH"
        System.out.println("Converted to String: " + str);

        // 2.7. capacity()
        // The capacity() method returns the current capacity of the StringBuilder.
        // This is the amount of space currently allocated in the internal buffer.
        System.out.println("Current capacity: " + sb.capacity());

        // 2.8. ensureCapacity()
        // The ensureCapacity() method ensures that the StringBuilder can hold at least the specified number of characters without reallocating memory.
        sb.ensureCapacity(50); // Ensures a minimum capacity of 50
        System.out.println("Capacity after ensureCapacity: " + sb.capacity());

        // 2.9. setLength()
        // The setLength() method sets the length of the StringBuilder to the specified value.
        // If the length is shorter, it truncates the string, and if it's longer, it pads the string with null characters (\u0000).
        sb.setLength(5);
        // StringBuilder now holds: "droWo"
        System.out.println("After setLength: " + sb);

        // ----------------------------------------
        // 3. Important Notes
        // ----------------------------------------
        // 3.1. Mutability
        // StringBuilder is mutable, meaning it can be modified directly.
        // Unlike String, modifications do not create new objects.

        // 3.2. Performance
        // StringBuilder is efficient when performing multiple string manipulations (e.g., concatenations in loops).
        // It prevents unnecessary object creation and memory reallocation, making it faster than using String for repeated modifications.

        // 3.3. Thread Safety
        // StringBuilder is **not thread-safe**. This means it is not synchronized for use in multiple threads simultaneously.
        // If thread safety is needed, consider using StringBuffer (which is thread-safe but slower).

        // 3.4. Capacity Management
        // StringBuilder has a default initial capacity of 16 characters.
        // As more characters are added, it grows automatically. When the capacity is reached, it typically doubles in size.
        // You can use ensureCapacity() to specify a minimum capacity if you know the string will be long.

        // 3.5. Memory Efficiency
        // StringBuilder has better memory efficiency compared to String when it comes to frequent string manipulation.
        // With String, each concatenation creates a new object, but StringBuilder modifies the existing buffer.

        // 3.6. StringBuilder vs StringBuffer
        // - StringBuffer is thread-safe but slower due to synchronization.
        // - StringBuilder is not thread-safe but faster for single-threaded applications.

        // ----------------------------------------
        // 4. When to Use StringBuilder
        // ----------------------------------------
        // 4.1. String Concatenation in Loops
        // StringBuilder should be used when concatenating strings inside loops or when there are frequent string manipulations.

        // Example:
        StringBuilder sbLoop = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sbLoop.append(i).append(" ");
        }
        // This will avoid creating new String objects repeatedly as String concatenation would.

        // 4.2. Modifying Strings Frequently
        // If your program requires frequent changes to the string, StringBuilder is a better option compared to String because of its mutability.

        // 4.3. Avoiding Unnecessary String Creation
        // Using StringBuilder prevents the creation of multiple String objects during concatenations, improving performance and memory efficiency.

        // 4.4. Efficient String Construction
        // For large-scale string manipulation, StringBuilder is often the best choice because it minimizes the overhead of creating new string objects.

        // Example: Efficient construction of a large string
        StringBuilder largeStr = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            largeStr.append("Java ").append(i).append("\n");
        }
        // StringBuilder avoids the inefficiencies of using String.

        // ----------------------------------------
        // 5. StringBuilder vs String
        // ----------------------------------------
        // String is immutable and creates a new object with each modification.
        // StringBuilder is mutable and modifies the internal buffer without creating new objects.
        // If you know that you will be making several changes to the string, StringBuilder is more efficient.

        // Example:
        String str1 = "Hello";
        str1 = str1 + " World"; // Creates a new String object every time (inefficient).

        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(" World");  // Efficient in terms of memory and performance.
    }
}
