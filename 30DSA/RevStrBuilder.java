public class RevStrBuilder {

    public static void main(String[] args){
        String str ="Hello";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("Reversed string (string builder):"+sb.toString());
     
    }
}