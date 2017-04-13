    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class IfElse {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();            
            String ans="";
            if(n%2==1){
              ans = "Weird";
            }
            else {
              ans = "Not Weird";
              if(6 <= n && n <= 20){
                  ans = "Weird";
              }
            }
            System.out.println(ans);
            
        }
    }