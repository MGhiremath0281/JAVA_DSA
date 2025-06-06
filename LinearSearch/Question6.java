/**
 * Problem Statement:
 * ------------------
 * You are given a 2D array 'accounts' where:
 * - Each row represents a customer
 * - Each column represents a bank account
 * - accounts[i][j] is the amount of money the i-th customer has in the j-th bank.
 *
 * Task:
 * -----
 * Return the maximum wealth among all customers.
 * A customer's wealth is the sum of money across all their bank accounts.
 */

class Question6 {
    public static void main(String[] args) {
        // Sample 2D array of bank account balances
        int[][] accounts = {
            {1, 2, 3},   // Customer 0 → Wealth = 1+2+3 = 6
            {3, 2, 1},   // Customer 1 → Wealth = 3+2+1 = 6
            {4, 5, 1}    // Customer 2 → Wealth = 4+5+1 = 10 (richest)
        };

        // Calling the function and printing the result
        System.out.println("Maximum Wealth: " + maxWealth(accounts));
    }

    /**
     * Function to find the maximum wealth among all customers.
     * @param accounts 2D array where each row is a customer's bank accounts
     * @return Maximum wealth among all customers
     */
    static int maxWealth(int[][] accounts) {
        // Initialize the max wealth to the smallest possible integer value
        int max = Integer.MIN_VALUE;

        // Loop through each customer (each row in the 2D array)
        for (int[] customer : accounts) {
            int sum = 0;

            // Sum up the current customer's account balances
            for (int money : customer) {
                sum += money;
            }

            // Check if the current customer's wealth is the largest we've seen
            if (sum > max) {
                max = sum;
            }
        }

        // Return the highest wealth found
        return max;
    }
}
