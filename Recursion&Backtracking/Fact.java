// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Fact {
    int factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        
        int recursiveCall = factorial(n - 1);
        int result = n * recursiveCall;
        return result;
    }

    public static void main(String[] args) {
        Fact m = new Fact();
        int number = 5;
        int fact = m.factorial(number);
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
