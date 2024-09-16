import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesisNew {
    public Boolean validParenthesisCheck(String st){
        Stack<Character> stack = new Stack<>();

        for(char a : st.toCharArray()){
            if(a == '(' || a == '{' || a == '[' ){
                stack.push(a);
            }else if(a == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }else if(a == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }else if(a == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("Enter a string : ");
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();

        ValidParenthesisNew ent = new ValidParenthesisNew();
        boolean result = ent.validParenthesisCheck(s);
        System.out.println(result);
        obj.close();
    }
}



/*
 * import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false; // Invalid closing parenthesis
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("Enter a string with parentheses: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ValidParenthesis validator = new ValidParenthesis();
        boolean result = validator.isValid(input);
        System.out.println("Is the input valid? " + result);
    }
}
 */