class Question1{
    // Method to search for a character in a string
    static boolean stringSearch(String name, char target) {
        // Check if the string is empty
        if (name.length() == 0) {
            return false;
        }

        // Loop through the string
        for (int i = 0; i < name.length(); i++) {
            // Get the character at index i
            char element = name.charAt(i);

            // Check if the character matches the target
            if (element == target) {
                return true; // Target found, return true
            }
        }

        // If loop completes without finding the target, return false
        return false;
    }

    public static void main(String[] args) {
        String name = "hello world";
        char target = 'o';

        // Call stringSearch method and print the result
        boolean result = stringSearch(name, target);

        // Output result
        if (result) {
            System.out.println("Target character found in the string.");
        } else {
            System.out.println("Target character not found in the string.");
        }
    }
}
