//Merge Two sorted arrays
import java.util.*;
public class MergeTSA {
    public static void main(String args[]){
        Integer[] arr1 = {1, 3, 5};
        Integer[] arr2 = {2, 4, 6};

        // Convert arrays to lists
        List<Integer> list1 = new ArrayList<>(Arrays.asList(arr1));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(arr2));

        // Merge the two lists
        list1.addAll(list2);

        // Sort the merged list
        Collections.sort(list1);

        // Print the merged sorted list
        System.out.println("Merged and sorted list: " + list1);

    }

    
}
