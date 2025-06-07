import java.util.Queue;
import java.util.LinkedList;

public class QueueLearning {
public static void main(String[] args) {
    Queue<String> queue = new LinkedList<>();
    System.out.println("== Queue Operations Demo ==");

    // --------------------------------------
    // 1. Enqueue elements into the queue
    // --------------------------------------
    queue.offer("A");
    queue.offer("B");
    queue.offer("C");
    System.out.println("[1] Enqueued elements (A, B, C): " + queue);

    // --------------------------------------
    // 2. Peek at the front element
    // --------------------------------------
    String frontElement = queue.peek();
    System.out.println("[2] Front element (peek): " + frontElement);

    // --------------------------------------
    // 3. Dequeue an element from the queue
    // --------------------------------------
    String dequeuedElement = queue.poll();
    System.out.println("[3] Dequeued element: " + dequeuedElement);
    System.out.println("[3] Queue after dequeue: " + queue);

    // --------------------------------------
    // 4. Check if the queue is empty
    // --------------------------------------
    boolean isEmpty = queue.isEmpty();
    System.out.println("[4] Is queue empty? " + isEmpty);

    // --------------------------------------
    // 5. Search for an element in the queue
    // --------------------------------------       
    boolean containsB = queue.contains("B");
    System.out.println("[5] Does the queue contain 'B'? " + containsB);

    // --------------------------------------
    // 6. Clear the queue
    queue.clear();
    System.out.println("[6] Queue cleared. Current queue: " + queue);
    // --------------------------------------
    // 7. Check size of the queue
    int size = queue.size();
    System.out.println("[7] Size of queue: " + size);
    // --------------------------------------
    // 8. Enqueue more elements
    queue.offer("X");
    queue.offer("Y");
    System.out.println("[8] Enqueued more elements (X, Y): " + queue);
    // --------------------------------------
    // 9. Iterate over the queue elements
    System.out.println("[9] Iterating over queue elements:");
    for (String element : queue) {
        System.out.println("Element: " + element);
    }
    // --------------------------------------
    // 10. Check if a specific element exists
    boolean containsX = queue.contains("X");
    System.out.println("[10] Does the queue contain 'X'? " + containsX);
    // --------------------------------------
    // 11. Search for an element that does not exist
    boolean containsZ = queue.contains("Z");   
    System.out.println("[11] Does the queue contain 'Z'? " + containsZ);
    // --------------------------------------
    // 12. Enqueue null element (if allowed)
    try {
        queue.offer(null);
        System.out.println("[12] Enqueued null element: " + queue);
    } catch (NullPointerException e) {
        System.out.println("[12] Cannot enqueue null element: " + e.getMessage());
    }
}    
}
