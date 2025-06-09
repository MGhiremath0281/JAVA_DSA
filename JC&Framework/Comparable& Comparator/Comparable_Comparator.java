import java.util.*;

// Class Student implements Comparable for natural ordering
class Student implements Comparable<Student> {
    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // ========= Comparable Interface ============
    // Comparable defines the natural/default sorting order.
    // Method: int compareTo(T other)
    // Return:
    //   - negative if this < other
    //   - 0 if this == other
    //   - positive if this > other
    @Override
    public int compareTo(Student other) {
        return this.id - other.id; // Natural order: by id ascending
    }

    @Override
    public String toString() {
        return "[" + id + ", " + name + ", " + marks + "]";
    }
}

// ========= Comparator Interface ============
// Used for custom sorting logic, outside the class itself.
// Method: int compare(T o1, T o2)
class SortByName implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name); // Sort by name alphabetically
    }
}

class SortByMarksDescending implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return b.marks - a.marks; // Sort by marks descending
    }
}

public class ComparatorVsComparable {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(102, "Alice", 85));
        students.add(new Student(101, "Bob", 95));
        students.add(new Student(103, "Charlie", 75));

        // ===== Using Comparable ======
        // Sorting based on natural order (defined in compareTo)
        Collections.sort(students); // sorts by id (ascending)
        System.out.println("Sorted by ID (Comparable): " + students);

        // ===== Using Comparator (name) ======
        Collections.sort(students, new SortByName());
        System.out.println("Sorted by Name (Comparator): " + students);

        // ===== Using Comparator (marks descending) ======
        Collections.sort(students, new SortByMarksDescending());
        System.out.println("Sorted by Marks Desc (Comparator): " + students);
    }
}

/*
────────────────────────────────────────────────────────
🌟 Comparable Interface (java.lang.Comparable<T>)
────────────────────────────────────────────────────────
- Defines **natural ordering** of objects.
- Only one way of sorting allowed.
- Used when object knows how it should be compared.

Syntax:
class ClassName implements Comparable<ClassName> {
    public int compareTo(ClassName other) {
        // return negative/zero/positive
    }
}

────────────────────────────────────────────────────────
🌟 Comparator Interface (java.util.Comparator<T>)
────────────────────────────────────────────────────────
- Used for **custom sorting logic** outside the object.
- Allows multiple sorting logics using different classes or lambdas.

Syntax:
class SortByXYZ implements Comparator<ClassName> {
    public int compare(ClassName a, ClassName b) {
        // custom comparison
    }
}

────────────────────────────────────────────────────────
🆚 Difference: Comparable vs Comparator
────────────────────────────────────────────────────────
| Feature             | Comparable             | Comparator                 |
|---------------------|-------------------------|-----------------------------|
| Package             | java.lang               | java.util                   |
| Method              | compareTo(T o)          | compare(T o1, T o2)         |
| Sorting logic       | Inside the class        | Outside the class           |
| Number of orders    | One (natural)           | Many (custom orders)        |
| Usage               | Collections.sort(list)  | Collections.sort(list, cmp) |

────────────────────────────────────────────────────────
🧪 Additional Notes
────────────────────────────────────────────────────────
- TreeSet, TreeMap use Comparable or Comparator for ordering.
- PriorityQueue uses Comparator for element ordering.
- `Collections.reverseOrder()` returns a reverse comparator.
*/
// Note: This code demonstrates the use of Comparable and Comparator interfaces in Java.
// It includes examples of sorting a list of Student objects by different criteria.
// The Student class implements Comparable for natural ordering by ID,