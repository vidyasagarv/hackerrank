import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean balanceDelims(String s){
        HashMap<Character, Character> delims = new HashMap<>();
        delims.put('(',')');
        delims.put('[',']');
        delims.put('{','}');
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(delims.containsKey(c)){
                stack.push(c);
            }
            if(delims.values().contains(c)){
                if(!stack.isEmpty() && c == delims.get(stack.peek())){
                    stack.pop();
                } else{
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean result = balanceDelims(s);
        if(result){   
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
}