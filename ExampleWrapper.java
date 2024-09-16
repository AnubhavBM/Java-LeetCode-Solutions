class CallInteger{
    private int i;
    // CallInteger(){}
    CallInteger(int i){
        this.i = i;
    }
    public int getValue(){
        return i;
    }
    public void setValue(int i){
        this.i = i;
    }
    @Override
    public String toString(){
        return Integer.toString(i);
    }
}

public class ExampleWrapper {

    public static void main(String[] args) {
        CallInteger num = new CallInteger(10);
        System.out.println(num);
    }
}