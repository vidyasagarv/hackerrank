import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MeanMedianMode {
    
    public static String mean(int[] array){
        float sum = 0;
        for(int i = 0; i < array.length; ++i){
            sum += array[i];
        }
        return String.format("%.1f", sum/array.length);
    }
    
    public static String median(int[] array){
        Arrays.sort(array);
        int middle = array.length/2;
        if(array.length%2 == 1){
            return String.format("%.1f", array[middle]);
        } else{
            return String.format("%.1f", (array[middle - 1] + array[middle])/2.0);
        }
    }
    
    public static int mode(int[] array){
        int mode = 0, maxCount = 0;
        for (int i = 0; i < array.length; ++i) {
            int count = 0;
            for (int j = 0; j < array.length; ++j) {
                if (array[j] == array[i]) ++count;
            }
            if (count > maxCount) {
                maxCount = count;
                mode = array[i];
            }
        }
        return mode;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i < N; ++i){
            arr[i] = sc.nextInt();
        }
        System.out.println(mean(arr));
        System.out.println(median(arr));
        System.out.println(mode(arr));
    }
}