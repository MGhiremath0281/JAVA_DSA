import java.util.Comparator;
import java.util.PriorityQueue;
public class Priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        System.out.println("== Priority Queue Operations Demo ==");

        // --------------------------------------
        // 1. Enqueue elements into the priority queue
        // --------------------------------------
        priorityQueue.offer(30);
        priorityQueue.offer(20);
        priorityQueue.offer(10);
        System.out.println("[1] Enqueued elements (30, 20, 10): " + priorityQueue);

        // --------------------------------------
        // 2. Peek at the front element
        // --------------------------------------
        Integer frontElement = priorityQueue.peek();
        System.out.println("[2] Front element (peek): " + frontElement);

        // --------------------------------------
        // 3. Dequeue an element from the priority queue
        // --------------------------------------
        Integer dequeuedElement = priorityQueue.poll();
        System.out.println("[3] Dequeued element: " + dequeuedElement);
        System.out.println("[3] Priority Queue after dequeue: " + priorityQueue);

        // --------------------------------------
        // 4. Check if the priority queue is empty
        // --------------------------------------
        boolean isEmpty = priorityQueue.isEmpty();
        System.out.println("[4] Is priority queue empty? " + isEmpty);

        // --------------------------------------
        // 5. Search for an element in the priority queue
        // --------------------------------------       
        boolean contains20 = priorityQueue.contains(20);
        System.out.println("[5] Does the priority queue contain '20'? " + contains20);

        // --------------------------------------
        // 6. Clear the priority queue
        priorityQueue.clear();
        System.out.println("[6] Priority Queue cleared. Current queue: " + priorityQueue);
        // --------------------------------------
        // 7. Check size of the priority queue
        int size = priorityQueue.size();
        System.out.println("[7] Size of priority queue: " + size);
        // --------------------------------------
        //Max heap cncepts in priority queue highest value gets more priority
        Queue<Integer> anotherQueue = new PriorityQueue<>(Comparator.reverseOrder());
        anotherQueue.offer(5);
        anotherQueue.offer(15);   
        anotherQueue.offer(25);
        System.out.println("[8] Enqueued more elements (5, 15, 25) in reverse order: " + anotherQueue);
        // --------------------------------------
        // 9. Iterate over the priority queue elements
        System.out.println("[9] Iterating over priority queue elements:");
        for (Integer element : priorityQueue) {
            System.out.println("Element: " + element);
        }
        // --------------------------------------
        // 10. Check if a specific element exists
        boolean contains10 = priorityQueue.contains(10);
        System.out.println("[10] Does the priority queue contain '10'? " + contains10);     
        // --------------------------------------   
        // 11. Search for an element that does not exist
        boolean contains50 = priorityQueue.contains(50);
        if (contains50) {
            System.out.println("[11] Element '50' found in the priority queue.");
        } else {
            System.out.println("[11] Element '50' not found in the priority queue.");
        }


    }
    
}
