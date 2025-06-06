class Subsquence {
    void printSubsequences(String str, String current, int index) {

        // Base Case
        if (index == str.length()) {
            System.out.println(current);
            return;
        }

        // Recursive Call 1: Include current character
        printSubsequences(str, current + str.charAt(index), index + 1);

        // Recursive Call 2: Exclude current character
        printSubsequences(str, current, index + 1);
    }

    public static void main(String[] args) {
        Subsquence m = new Subsquence();
        m.printSubsequences("abc", "", 0);
    }
}
