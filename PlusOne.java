public class PlusOne {
    public static void main(String[] args) {
        int[] digits = new int[]{9};
        digits[digits.length -1] += 1;
        for(int i=digits.length-1; i>0 ; i--){
            if(digits[i] == 10){
                digits[i] = 0;
                digits[i-1] += 1;
            }
        }
        if(digits[0] == 10){
            digits[0] = 0;
            int[] newdig = new int[digits.length+1];
            newdig[0] = 1;
            System.arraycopy(digits, 0, newdig, 1, digits.length);
            digits = newdig;
        }

        for(int a : digits){
            System.out.print(a + " ");
        }
    }
}
