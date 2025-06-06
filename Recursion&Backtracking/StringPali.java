class StringPali{
    // Function to check if the string is a palindrome using recursion
    int palindrome(String s, int start, int end) {
        if (start >= end) {
            return 1; // base case: if pointers have met or crossed, it's a palindrome
        }
        if (s.charAt(start) != s.charAt(end)) {
            return 0; // characters don't match
        }
        return palindrome(s, start + 1, end - 1); // recursive call inward
    }

    public static void main(String[] args) {
        StringPali m = new StringPali();
        String word = "madam";

        int result = m.palindrome(word, 0, word.length() - 1);

        if (result == 1) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
