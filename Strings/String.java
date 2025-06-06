/**
 * -------------------------------------------------------------
 * Java Strings - Complete Glorified Documentation with Examples
 * -------------------------------------------------------------
 *
 * Definition:
 * ----------
 * A String in Java is an object that represents a sequence of characters.
 * Strings are immutable, meaning once created, they cannot be changed.
 * String is a class in java.lang package.
 *
 * Declaration:
 * ------------
 * String str1 = "Hello";          // String literal
 * String str2 = new String("Hi"); // String object using constructor
 *
 * Memory:
 * -------
 * - String literals are stored in a String Pool (heap + constant pool).
 * - Using 'new' keyword stores string in heap separately.
 */
public class String {
    public static void main(String[] args) {

        String str = "Hello Java World";

        // 1. charAt(int index) → returns character at specified index
        System.out.println("charAt(1): " + str.charAt(1)); // 'e'

        // 2. length() → returns length of string
        System.out.println("Length: " + str.length()); // 16

        // 3. substring(int beginIndex)
        System.out.println("Substring from index 6: " + str.substring(6)); // "Java World"

        // 4. substring(int beginIndex, int endIndex)
        System.out.println("Substring from 6 to 10: " + str.substring(6, 10)); // "Java"

        // 5. contains(CharSequence s)
        System.out.println("Contains 'Java'? " + str.contains("Java")); // true

        // 6. equals(Object another)
        System.out.println("Equals 'Hello'? " + str.equals("Hello")); // false

        // 7. equalsIgnoreCase(String another)
        System.out.println("EqualsIgnoreCase 'hello java world'? " + str.equalsIgnoreCase("hello java world")); // true

        // 8. isEmpty()
        System.out.println("Is Empty? " + str.isEmpty()); // false

        // 9. isBlank() (Java 11+)
        System.out.println("Is Blank? " + "   ".isBlank()); // true

        // 10. concat(String str)
        System.out.println("Concat: " + str.concat(" Rocks!")); // "Hello Java World Rocks!"

        // 11. indexOf(int ch)
        System.out.println("Index of 'a': " + str.indexOf('a')); // 7

        // 12. indexOf(String str)
        System.out.println("Index of 'Java': " + str.indexOf("Java")); // 6

        // 13. lastIndexOf(char)
        System.out.println("Last Index of 'o': " + str.lastIndexOf('o')); // 11

        // 14. toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase()); // "hello java world"

        // 15. toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase()); // "HELLO JAVA WORLD"

        // 16. trim() → removes leading and trailing spaces
        System.out.println("Trimmed: '" + "  Hello  ".trim() + "'");

        // 17. replace(char old, char new)
        System.out.println("Replace 'l' with 'x': " + str.replace('l', 'x')); // Hexxo Java Worxd

        // 18. replace(CharSequence target, CharSequence replacement)
        System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));

        // 19. replaceAll(regex, replacement)
        System.out.println("ReplaceAll vowels with '*': " + str.replaceAll("[aeiou]", "*"));

        // 20. replaceFirst(regex, replacement)
        System.out.println("ReplaceFirst vowel with '*': " + str.replaceFirst("[aeiou]", "*"));

        // 21. split(String regex)
        String[] words = str.split(" ");
        System.out.println("Split by space:");
        for (String word : words) System.out.println(word);

        // 22. startsWith(String prefix)
        System.out.println("Starts with 'Hello'? " + str.startsWith("Hello")); // true

        // 23. endsWith(String suffix)
        System.out.println("Ends with 'World'? " + str.endsWith("World")); // true

        // 24. compareTo(String another)
        System.out.println("CompareTo 'Hello': " + str.compareTo("Hello")); // Lexicographic diff

        // 25. compareToIgnoreCase(String another)
        System.out.println("CompareToIgnoreCase 'hello JAVA world': " + str.compareToIgnoreCase("hello JAVA world")); // 0

        // 26. matches(String regex)
        System.out.println("Matches '[A-Za-z ]+': " + str.matches("[A-Za-z ]+")); // true

        // 27. toCharArray()
        char[] chars = str.toCharArray();
        System.out.print("toCharArray(): ");
        for (char ch : chars) System.out.print(ch + " ");
        System.out.println();

        // 28. join(CharSequence delimiter, CharSequence... elements)
        System.out.println("Join: " + String.join("-", "Java", "is", "cool")); // Java-is-cool

        // 29. format(String format, Object... args)
        String formatted = String.format("My name is %s and I am %d years old", "Muttu", 21);
        System.out.println("Formatted: " + formatted);

        // 30. intern() → returns reference from string pool
        String str1 = new String("Core");
        String str2 = str1.intern(); // puts into string pool
        System.out.println("Interned equals literal? " + (str2 == "Core")); // true

        // 31. repeat(int count) (Java 11+)
        System.out.println("Repeat 3 times: " + "Hi ".repeat(3)); // "Hi Hi Hi "

        // 32. strip() (Java 11+)
        System.out.println("Strip: '" + "  Clean  ".strip() + "'");

        // 33. stripLeading() (Java 11+)
        System.out.println("Strip Leading: '" + "  Leading  ".stripLeading() + "'");

        // 34. stripTrailing() (Java 11+)
        System.out.println("Strip Trailing: '" + "  Trailing  ".stripTrailing() + "'");
    }
}
