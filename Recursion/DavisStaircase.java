import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static Map<Integer,Integer> cache = new HashMap<>();
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        cache.put(0,1); //base case
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
            int numOfWays = climb(n);
            System.out.println(numOfWays);
        }
    }
    
    public static int climb(int n){
        int steps = 0;
        if(n < 0){
            return 0;
        }
        if(cache.containsKey(n)){
            return cache.get(n);
        }
        steps = climb(n-1) + climb(n-2) + climb(n-3);
        cache.put(n, steps);
        return steps;
    }
}
