import java.util.Stack;
//         // --------------------------------------
public class Stacklearng {
    public static void main(String args[]){
        Stack<String> stack = new Stack<>();
        System.out.println("== Stack Operations Demo ==");
        // --------------------------------------
        // 1. Push elements onto the stack
        // --------------------------------------
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("[1] Pushed elements (A, B, C): " + stack);
        // --------------------------------------
        // 2. Peek at the top element
        // --------------------------------------
        System.out.println("[2] Top element (peek): " + stack.peek());
        // --------------------------------------
        // 3. Pop an element from the stack
        // --------------------------------------
        String poppedElement = stack.pop();
        System.out.println("[3] Popped element: " + poppedElement);
        System.out.println("[3] Stack after pop: " + stack);
        // --------------------------------------
        // 4. Check if the stack is empty
        // --------------------------------------
        boolean isEmpty = stack.isEmpty();
        System.out.println("[4] Is stack empty? " + isEmpty);
        // --------------------------------------
        // 5. Search for an element in the stack
        // --------------------------------------       
        int position = stack.search("B");
        if (position != -1) {
            System.out.println("[5] Element 'B' found at position: " + position);
        } else {
            System.out.println("[5] Element 'B' not found in the stack.");
        }
        // --------------------------------------
        // 6. Clear the stack
        stack.clear();
        System.out.println("[6] Stack cleared. Current stack: " + stack);
        // --------------------------------------
        // 7. Check size of the stack
        int size = stack.size();
        System.out.println("[7] Size of stack: " + size);
        // --------------------------------------
        // 8. Push more elements
        stack.push("X");
        stack.push("Y");
        System.out.println("[8] Pushed more elements (X, Y): " + stack);
        // --------------------------------------
        // 9. Iterate over the stack elements
        System.out.println("[9] Iterating over stack elements:");
        for (int i = 0; i < stack.size(); i++) {
            System.out.println("Element at index " + i + ": " + stack.get(i));
        }
        // --------------------------------------
        // 10. Check if a specific element exists
        boolean containsX = stack.contains("X");
        System.out.println("[10] Does the stack contain 'X'? " + containsX);
        // --------------------------------------
        // 11. Search for an element that does not exist
        int nonExistentPosition = stack.search("Z");
        if (nonExistentPosition != -1) {
            System.out.println("[11] Element 'Z' found at position: " + nonExistentPosition);
        } else {
            System.out.println("[11] Element 'Z' not found in the stack.");
        }
        // --------------------------------------
        // 12. Check the top element after some operations
        if (!stack.isEmpty()) {
            System.out.println("[12] Top element after operations: " + stack.peek());
        } else {
            System.out.println("[12] Stack is empty, no top element.");
        }
        // --------------------------------------
        // 13. Final size of the stack
        System.out.println("[13] Final size of stack: " + stack.size());
    }
}
