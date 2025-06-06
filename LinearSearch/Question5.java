// Count how many numbers have an even number of digits
class Question5 {
    public static void main(String args[]) {
        int[] nums = {19, 124, 2, 1753, 89, 1};
        int count = 0;

        for (int num : nums) {
            if (hasEvenDigits(num)) {
                count++;
            }
        }

        System.out.println("Count of numbers with even digits: " + count);
    }

    static boolean hasEvenDigits(int n) {
        int digits = 0;

        while (n > 0) {
            digits++;
            n = n / 10;
        }

        return digits % 2 == 0;
    }
}
/*------------------OR-------------------
 * class Main {
    public static void main(String[] args) {
        int[] nums = {19, 124, 2, 1753, 89, 1};
        int count = 0;

        for (int num : nums) {
            if (hasEvenDigits(num)) {
                count++;
            }
        }

        System.out.println("Count of numbers with even digits: " + count);
    }

    static boolean hasEvenDigits(int n) {
        return String.valueOf(n).length() % 2 == 0;
    }
}

 */