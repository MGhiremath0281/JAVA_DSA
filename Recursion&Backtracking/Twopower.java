// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Twopower {
    int twopowern(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        
        int recursiveCall = twopowern(n - 1);
        int result = 2 * recursiveCall;
        return result;
    }

    public static void main(String[] args) {
        Twopower m = new Twopower();
        int number = 5;
        int result = m.twopowern(number);
        System.out.println("2 raised to the power " + number + " is: " + result);
    }
}
