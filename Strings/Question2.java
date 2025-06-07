public class Question2 {
    public static void main(String args[]){
        String str = "Hello";
        char [] charArray = str.toCharArray();
        int left =0;
        int right = charArray.length - 1;

        while(left<right){
            if(charArray[left]!=charArray[right]){
                System.out.println("Not a palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("Palindrome");
    }
    
}
