public class SumofD{
public static void main(String args[]){
        int [] arr ={1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Sum of even numbers: " + sum);
    }
}
/*
 * for numbers
 * public class DigitSum {

    /**
     * Calculates the sum of the digits of a given number.
     *
     * @param n An integer.
     * @return The sum of the digits of n.
     */
    public static int sumOfDigits(int n) {
        // Handle negative numbers by converting to positive
        if (n < 0) {
            n = Math.abs(n);
        }

        int digitSum = 0;

        // Handle the case of n = 0 separately, as the loop won't run
        if (n == 0) {
            return 0;
        }

        while (n > 0) {
            int digit = n % 10;  // Get the last digit
            digitSum += digit;   // Add it to the sum
            n /= 10;             // Remove the last digit
        }
        return digitSum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of digits of 123: " + sumOfDigits(123));     // Expected: 6
        System.out.println("Sum of digits of 4567: " + sumOfDigits(4567));   // Expected: 22
        System.out.println("Sum of digits of 0: " + sumOfDigits(0));         // Expected: 0
        System.out.println("Sum of digits of 9: " + sumOfDigits(9));         // Expected: 9
        System.out.println("Sum of digits of 10: " + sumOfDigits(10));       // Expected: 1
        System.out.println("Sum of digits of -123: " + sumOfDigits(-123)); // Expected: 6 (abs value)
    }
}*/