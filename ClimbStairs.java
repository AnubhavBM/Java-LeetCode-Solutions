public class ClimbStairs {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 2;
        for(int j=3;j<=n;j++){
            arr[j] = arr[j-1] + arr[j-2];
        }
        System.out.println(arr[n]);
    }
}
