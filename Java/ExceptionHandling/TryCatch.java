import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TryCatch {

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println((int)a/b);
        } catch(Exception e){
            System.out.print(e.getClass().getCanonicalName());
            if(e instanceof ArithmeticException){
                System.out.print(": " + e.getMessage());
            }
        } 
    }
}