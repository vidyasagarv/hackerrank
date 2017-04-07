import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Primality {
    
    public static String isPrime(int n){
        final String prime = "Prime";
        final String notPrime = "Not prime";
        if(n == 1){
            return notPrime;
        }
        if(n == 2){
            return prime;
        }
        for(int i = 2; i <= Math.sqrt(n); ++i){
            if(n%i == 0){
                return notPrime;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int a0 = 0; a0 < p; a0++){
            int n = in.nextInt();
            System.out.println(isPrime(n));
        }
        
    }
}
