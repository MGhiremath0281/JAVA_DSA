import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = sc.nextLine();
        
        int decimalValue = 0;
        int base = 1; // 2^0
        
        // Convert binary string to decimal
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            if (binaryString.charAt(i) == '1') {
                decimalValue += base;
            }
            base *= 2; // Increase the base (2^n)
        }
        
        System.out.println("Decimal value: " + decimalValue);
    }
    
}
