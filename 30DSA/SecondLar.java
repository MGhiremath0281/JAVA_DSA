public class SecondLar{
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest element is: " + second);
        }
    }
}
