public class RotateArray {
    public static void main(String[] args) {
        int i=0, k=3;
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int n = nums.length;
        k = k%n;
        int[] reverse = new int[n];
        for(i=0;i<n;i++){
            reverse[(i+k)%n] = nums[i];
        }
        for(i=0;i<n;i++){
            nums[i]=reverse[i];
        }
        System.out.println("Nums after reverse : ");
        for(int val : nums){
            System.out.print(val + " ");
        }
    }
}
