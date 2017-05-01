import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StandardDeviation {

    public static double mean(int[] array){
        float sum = 0;
        for(int i = 0; i < array.length; ++i){
            sum += array[i];
        }
        return sum/array.length;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i < N; ++i){
            arr[i] = sc.nextInt();
        }
        double mean = mean(arr);
        double sumOfSquares = 0.0;
        for(int i = 0; i < N; ++i){
            sumOfSquares += Math.pow((arr[i] - mean), 2);
        }
        System.out.format("%.1f",Math.sqrt(sumOfSquares/N));
    }
}