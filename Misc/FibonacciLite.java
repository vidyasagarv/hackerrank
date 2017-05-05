import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int fib(int n){
        int fib0 = 0, fib1 = 1, temp = 0; 
        while(n > 0){
            temp = fib1;
            fib1 = fib0 + fib1;
            fib0 = temp;
            n--;
        }
        return fib0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = fib(n);
        System.out.println(result);
    }
}