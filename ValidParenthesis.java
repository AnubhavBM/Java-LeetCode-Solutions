import java.util.Scanner;

public class ValidParenthesis {
    public boolean validChecker(String st){
        Boolean check = false;
        
        int size = st.length();
        char[] strarr = st.toCharArray();

        for(int i=0; i<size; i++){
            char a = strarr[i];
            if(a=='('){
                for(int j=0; j<size; j++){
                    if(strarr[j]==')'){
                        check = true;
                    }
                }
            }
            if(a=='{'){
                for(int j=0; j<size; j++){
                    if(strarr[j]=='}'){
                        check = true;
                    }
                }
            }
            if(a=='['){
                for(int j=0; j<size; j++){
                    if(strarr[j]==']'){
                        check = true;
                    }
                }
            }
        }

        return check;
    }

    public static void main(String[] args) {
        System.out.println("Enter String : ");
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();

        System.out.println("Entered String is : "+ s);

        ValidParenthesis ent = new ValidParenthesis();

        boolean result = ent.validChecker(s);
        System.out.println(result);
        obj.close();
    }
}
