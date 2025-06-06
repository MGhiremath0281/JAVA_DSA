import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // ---------------------------- ARRAY BASICS ----------------------------
        // Definition: An array is a data structure used to store multiple values of the same type.
        // Arrays in Java are objects that store elements in a contiguous block of memory.
        // Syntax: datatype[] arrayName = new datatype[size];
        int[] arr = new int[5]; // Array of integers with size 5 (default values: 0)

        // Accessing default values
        System.out.println("Default value at index 1 (int array): " + arr[1]); // Output: 0

        // String array example (default value will be null since String is a reference type)
        String[] name = new String[5];
        System.out.println("Default value at index 1 (String array): " + name[1]); // Output: null

        // ---------------------------- ARRAY ASSIGNMENT ----------------------------
        // Manually assigning values to elements
        arr[0] = 23;
        arr[1] = 24;
        arr[2] = 25;
        arr[3] = 26;

        System.out.println("Value at index 1 after assignment: " + arr[1]); // Output: 24

        // ---------------------------- INPUT FROM USER ----------------------------
        System.out.println("Enter 5 integers to store in the array:");
        for (int i = 0; i < arr.length; i++) { // Important: use < instead of <= to avoid IndexOutOfBoundsException
            arr[i] = in.nextInt();
        }

        // ---------------------------- ARRAY TRAVERSAL ----------------------------

        // Method 1: Using traditional for loop
        System.out.println("Array elements using for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        // Method 2: Using enhanced for-each loop
        System.out.println("Array elements using for-each loop:");
        for (int num : arr) {
            System.out.println(num);
        }

        // ---------------------------- COMMON ERROR ----------------------------
        // Trying to access index 5 will throw ArrayIndexOutOfBoundsException
        // System.out.println(arr[5]); // Uncommenting this line will crash the program

        // ---------------------------- ARRAY UTILITIES ----------------------------
        // Arrays.toString() is used to print the entire array in a readable format
        System.out.println("Array as String: " + Arrays.toString(arr));

        // ---------------------------- ARRAY OF OBJECTS ----------------------------
        // You can create an array of any object type (like String)
        String[] str = new String[4];
        System.out.println("Enter 4 names:");
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next(); // Taking input for String array
        }

        System.out.println("Names entered:");
        for (String s : str) {
            System.out.println(s);
        }

        // ---------------------------- KEY ARRAY TERMS ----------------------------
        // 1. Indexing starts from 0 in Java arrays.
        // 2. Fixed Size: Once declared, the size of the array cannot be changed.
        // 3. arr.length: A property to get the size of the array (no parentheses since it's a field, not a method).
        // 4. Default Values: int → 0, double → 0.0, boolean → false, reference types (like String) → null.
        // 5. Arrays are stored in heap memory and are referenced by variables.

        in.close(); // Close the scanner to avoid memory leaks
    }
}
