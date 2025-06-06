public class Question1 {
    public static void main(String args[]){
        String str = "Hello";
        char[] charArray = str.toCharArray();  // Changed the variable name to avoid conflict with keyword 'char'
        int left = 0, right = charArray.length - 1;
        
        // Reversing the character array
        while(left < right){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        
        // Converting char[] back to String
        String reversed = new String(charArray);  // Corrected the constructor
        System.out.println("Reversed String: " + reversed);  // Output the reversed string
    }
}
