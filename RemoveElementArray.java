import java.util.*;

public class RemoveElementArray {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int val = 2, i, k=0;
        int max = Integer.MAX_VALUE;
        for(i=0;i<=nums.length-1;i++){
            if(nums[i]==val){
                nums[i] = max;
            }
            if(nums[i]!=max){
                k++;
            }
        }
        Arrays.sort(nums);
        System.out.println("Nums array : ");
        for(int l =0;l<=nums.length-1;l++){
            System.out.print(" " + nums[l]);
        }
        System.out.println("\nk : "+k);
    }
}


/*  Best Solution --
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int x : nums) {
            if (x != val) {
                nums[k++] = x;
            }
        }
        return k;
    } */