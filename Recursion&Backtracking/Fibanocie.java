// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Fibanocie{
    int fibonacci(int n) {
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }

        int recursiveCall1 = fibonacci(n - 1);
        int recursiveCall2 = fibonacci(n - 2);
        int result = recursiveCall1 + recursiveCall2;
        return result;
    }

    public static void main(String[] args) {
        Fibanocie m = new Fibanocie();
        int number = 5;
        int result = m.fibonacci(number);
        System.out.println("Fibonacci number at position " + number + " is: " + result);
    }
}
