public class Missing {
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10}; // missing 5
        int n = arr.length + 1; // total numbers expected

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int totalSum = n * (n + 1) / 2;
        int missingNumber = totalSum - sum;

        System.out.println("The missing number is: " + missingNumber);
    }
}
