class Countways {
    int countWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return countWays(n - 1) + countWays(n - 2);
    }

    public static void main(String[] args) {
        Countways m = new Countways();
        int stairs = 5;
        int ways = m.countWays(stairs);
        System.out.println("Total ways to reach " + stairs + "th stair: " + ways);
    }
}
