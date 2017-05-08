import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CoinChange {

    
    static long getWays(long n, long[] c){
        //table to store intermediary results
        long[] mem = new long[(int)n+1];
        //initialize
        Arrays.fill(mem,0);
        mem[0] = 1;
        int len = c.length;
        //pick coins and update the table
        for(int i = 0; i < len; i++){
            int elem = (int) c[i];
            for(int j = elem; j <= n; j++){
                mem[j] += mem[j-elem];
            }
        }
        return mem[(int)n];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] c = new long[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextLong();
        }
        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
        long ways = getWays(n, c);
        System.out.println(ways);
    }
}
