public class MoveZeros {
    public static void main(String[] args) {
        int j=0;
        int[] nums = new int[]{1,0,4,0,56,0,98};
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        while(j<nums.length){
            nums[j]=0;
            j++;
        }
        //Print nums array after moving zeros
        for(int val : nums){
            System.out.print(val + " ");
        }
    }
}
