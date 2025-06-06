class Question2{
    // Method to search for a character in a string
    static boolean stringSearch(String name, char target,int start,int end) {
        // Check if the string is empty
        if (name.length() == 0) {
            return false;
        }

        // Loop through the string
        for (int i = start; i < end; i++) {
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
        int start = 0;
        int end = 4;

        // Call stringSearch method and print the result
        boolean result = stringSearch(name, target,start,end);

        // Output result
        if (result) {
            System.out.println("Target character found in the string.");
        } else {
            System.out.println("Target character not found in the string.");
        }
    }
}
