import java.math.BigInteger;
public class BinaryStringAdd {
    public static void main(String[] args) {
        String a = "10100101";
        String b = "101010";
        BigInteger num1 = new BigInteger(a,2);
        BigInteger num2 = new BigInteger(b,2);
        BigInteger sum = num1.add(num2);
        System.out.println("Sum : " + sum.toString(2));
    }
}
