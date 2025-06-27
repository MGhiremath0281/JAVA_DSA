// Method 1: Reverse a string using a loop
public class RevStrLoop {
    public static void main(String[] args) {
        String str = "Hello";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // Append characters from end to start
        }

        System.out.println("Reversed string (loop): " + reversed);
    }
}
