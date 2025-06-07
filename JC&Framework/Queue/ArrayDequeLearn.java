import java.util.Arrays;

public class ArrayDequeLearn {
   public static void main(String[] args) {
    ArrayDeque<Integer> deque = new ArrayDeque<>()
    System.out.println("== ArrayDeque Operations Demo ==");
    // --------------------------------------
    // 1. Add elements to the front and back
    // --------------------------------------   
    deque.addFirst(10);
    deque.addLast(20);
    deque.addFirst(5);
    deque.addLast(30);
    System.out.println("[1] Added elements (5, 10, 20, 30): " + deque);
    // --------------------------------------
    // 2. Peek at the front and back elements
    // --------------------------------------
    Integer frontElement = deque.peekFirst();       
    Integer backElement = deque.peekLast();
    System.out.println("[2] Front element (peek): " + frontElement);
    System.out.println("[2] Back element (peek): " + backElement);
    // --------------------------------------
    // 3. Remove elements from the front and back
    // --------------------------------------
    Integer removedFront = deque.removeFirst();
    Integer removedBack = deque.removeLast();
    System.out.println("[3] Removed front element: " + removedFront);
    System.out.println("[3] Removed back element: " + removedBack);
    System.out.println("[3] Deque after removals: " + deque);
    // --------------------------------------
    // 4. Check if the deque is empty
    // --------------------------------------
    boolean isEmpty = deque.isEmpty();
    System.out.println("[4] Is deque empty? " + isEmpty);
    // --------------------------------------
    // 5. Search for an element in the deque
    // --------------------------------------
    boolean contains20 = deque.contains(20);
    System.out.println("[5] Does the deque contain '20'? " + contains20);
    // --------------------------------------
    // 6. Clear the deque       
    deque.clear();
    System.out.println("[6] Deque cleared. Current deque: " + deque);
    // --------------------------------------
    // 7. Check size of the deque
    int size = deque.size();
    System.out.println("[7] Size of deque: " + size);
    // --------------------------------------
    // 8. Add more elements
    deque.addFirst(100);
    deque.addLast(200);
    System.out.println("[8] Added more elements (100, 200): " + deque);     
    // --------------------------------------
    // 9. Iterate over the deque elements
    System.out.println("[9] Iterating over deque elements:");
    for (Integer element : deque) {
        System.out.println("Element: " + element);
    }
    // --------------------------------------
    // 10. Convert deque to array
    Integer[] array = deque.toArray(new Integer[0]);
    System.out.println("[10] Deque converted to array: " + Arrays.toString(array));
    // --------------------------------------
    // 11. Check if a specific element exists
    boolean contains100 = deque.contains(100);
    System.out.println("[11] Does the deque contain '100'? " + contains100);
   } 
    
}
