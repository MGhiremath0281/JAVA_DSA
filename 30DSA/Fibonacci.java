public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // number of terms to print

        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + " " + b);

        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
    }
}
/*
 * Recursive Approach
 * public class FibonacciSimple {
    public static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;

        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}

 */
