import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static BigInteger fact(int n){
        BigInteger factorial = new BigInteger("1");
        if(n == 0 || n == 1){
            return factorial;
        }
        for(int i = 2; i <= n; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger result = fact(n);
        System.out.println(result.toString());
    }
}