import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean flag = true;
        for(int i = 0; i < A.length(); ++i){
            if(A.charAt(i) != A.charAt(A.length() - i - 1)){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}