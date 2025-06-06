import java.util.Arrays;

public class Question3 {
    // Method to check if two strings are anagrams
    static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // If lengths differ, they cannot be anagrams
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1); // Sort the first string's characters
        Arrays.sort(charArray2); // Sort the second string's characters
        return Arrays.equals(charArray1, charArray2); // Check if sorted arrays are equal
    }

    public static void main(String args[]) {
        String str1 = "hello";
        String str2 = "hello";
        
        // Checking if the strings are anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
