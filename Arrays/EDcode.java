import java.util.*;

public class EDcode {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            res.append(s.length()).append('#').append(s);
        }
        return res.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            // find the delimiter #
            while (str.charAt(j) != '#') {
                j++;
            }
            // extract length of the string
            int length = Integer.parseInt(str.substring(i, j));
            // move i to the start of actual string
            i = j + 1;
            // extract the string of given length
            res.add(str.substring(i, i + length));
            // move i to next encoded string
            i = i + length;
        }
        return res;
    }

    // Main method to test encode/decode
    public static void main(String[] args) {
        Solution codec = new Solution();
        List<String> input = Arrays.asList("hello", "world", "muktananda", "hiremath");
        
        String encoded = codec.encode(input);
        System.out.println("Encoded: " + encoded);

        List<String> decoded = codec.decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
}
