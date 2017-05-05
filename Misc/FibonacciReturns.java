import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static BigInteger fib(int n){
        BigInteger fib0 = new BigInteger("0");
        BigInteger fib1 = new BigInteger("1");
        BigInteger temp = new BigInteger("0"); 
        while(n > 0){
            temp = fib1;
            fib1 = fib0.add(fib1);
            fib0 = temp;
            n--;
        }
        return fib0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){    
        int n = sc.nextInt();
        BigInteger result = fib(n);
        System.out.println(result.toString());
        }
    }
}