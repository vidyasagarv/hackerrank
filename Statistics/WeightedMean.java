import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class WeightedMean {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x[] = new int[N];
        int a = 0, b = 0, w;
        for(int i = 0; i < N; i++){
            x[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            w = sc.nextInt();
            a += x[i]*w;
            b += w;
        }
        System.out.printf("%.1f",((float)a)/b);
    }
}