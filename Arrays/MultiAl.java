import java.util.ArrayList;
import java.util.Scanner;

public class MultiAl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---------------------------------------------
        // 💡 Defining a 2D ArrayList (List of Lists)
        // ---------------------------------------------
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initialize inner lists (3 rows for example)
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>()); // creates empty row
        }

        // ---------------------------------------------
        // 📥 Taking input for each row (column size can vary)
        // ---------------------------------------------
        System.out.println("Enter elements for each row:");
        for (int row = 0; row < list.size(); row++) {
            System.out.println("Enter 3 elements for row " + (row + 1) + ":");
            for (int col = 0; col < 3; col++) {
                list.get(row).add(sc.nextInt()); // add to that row
            }
        }

        // ---------------------------------------------
        // 📤 Printing the nested ArrayList
        // ---------------------------------------------
        System.out.println("\nYour 2D ArrayList:");
        for (ArrayList<Integer> innerList : list) {
            System.out.println(innerList);
        }

        // ---------------------------------------------
        // 🛠 Modifying an element (e.g., row 1, col 2)
        list.get(0).set(1, 99); // sets second element in first row to 99
        System.out.println("\nAfter modifying row 0, col 1 to 99:");
        System.out.println(list);

        // ---------------------------------------------
        // ➕ Adding a new element in a row
        list.get(1).add(77); // adds to end of second row
        System.out.println("\nAfter adding 77 to row 1:");
        System.out.println(list);

        // ---------------------------------------------
        // ➖ Removing an element
        list.get(2).remove(0); // removes first element in third row
        System.out.println("\nAfter removing first element from row 2:");
        System.out.println(list);

        // ---------------------------------------------
        // 📏 Getting size of rows and columns
        System.out.println("\nNumber of rows: " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Row " + i + " size: " + list.get(i).size());
        }

        sc.close();
    }
}
