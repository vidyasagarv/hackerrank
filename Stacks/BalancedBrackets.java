import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedBrackets {
    
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < expression.length(); ++i){
            char c = expression.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else if(c == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.pop() != '('){
                    return false;
                }
            } else if(c == '}'){
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.pop() != '{'){
                    return false;
                }
            } else if(c == ']'){
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.pop() != '['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
