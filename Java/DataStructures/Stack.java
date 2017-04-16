import java.util.*;
class Solution{
   
   public static boolean isBalanced(String input){
       Stack<Character> stack = new Stack<>();
       for(int i = 0; i < input.length(); ++i){
           char c = input.charAt(i);
           if(c == '{' || c == '[' || c == '('){
               stack.push(c);
           } else if(!stack.empty() &&
                      ( ( stack.peek()=='{' && c=='}' ) || ( stack.peek()=='(' && c==')' ) || ( stack.peek()=='[' && c==']' ) ) ){
               stack.pop();
           } else {
               return false;
           }
       }
       return stack.empty();
   } 
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      while (sc.hasNext()) {
         String input=sc.next();
         System.out.println(isBalanced(input));
      }
      
   }
}
