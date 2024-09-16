public class AssertionsTest {
    public static void main(String[] args)
    {
        int age = 2;
        assert age >= 18 : "Cannot Vote";
        System.out.println("The voter's age is " + age);
    }
}
