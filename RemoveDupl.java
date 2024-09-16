import java.util.*;

public class RemoveDupl {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4}; 
        HashSet<Integer> numbers = new HashSet<>();
        int i=0, k=0;

        for(i=0;i<=nums.length-1;i++){
            int c=nums[i];
            numbers.add(c);
        }
        // System.out.println("Hashset : "+numbers);
        k = numbers.size();

        Integer[] arr = numbers.toArray(new Integer[numbers.size()]);
        Arrays.sort(arr);
        System.out.println("Size of Array : "+k);
        System.out.println("Nums array : ");
        for (int value : arr) {
            System.out.print(value + " ");
        }

    }
}