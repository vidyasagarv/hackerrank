import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InterquartileRange {

    public static double median(int[] array, int start, int end){
		int arrayLength = end - start;
        int middle = (start + end)/2;
        if(arrayLength%2 == 0){ //odd number of elements
            return array[middle];
        } else{
            return (array[middle] + array[middle + 1])/2.0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] element = new int[size];
        int [] frequency = new int[size];
        for (int i = 0; i < size; i++) {
            element[i] = sc.nextInt();
        }
        
        int numElements = 0;
        for (int i = 0; i < size; i++) {
            frequency[i] = sc.nextInt();
            numElements += frequency[i];
        }
        
        int [] data = new int[numElements];
        int index = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < frequency[i]; j++) {
                data[index] = element[i];
                index++;
            }
        }
        Arrays.sort(data);
        
        Double q1 = median(data, 0, data.length/2 - 1);
        Double q3 = median(data, data.length/2 + 1, data.length - 1);
        
        System.out.print(q3-q1);
    }
}