public class SearchPosition {
    public int binaryImpl(int[] nums, int tar){
        int mid = 0, first = 0, last = nums.length-1, index = 0;
        while(first <= last){
            mid = (first+last)/2;
            if(nums[mid]==tar){
                index = mid;
                return index;
            }else if(nums[mid] < tar){
                first = mid+1;
            }else if(nums[mid] > tar){
                last = mid-1;
            }
        }
        return first;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{-4, -1, 3, 7, 10, 11};
        int target = 1092;
        SearchPosition obj = new SearchPosition();
        System.out.println("Index : " + obj.binaryImpl(arr, target));
    }
}