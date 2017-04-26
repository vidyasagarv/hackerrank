import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MeanMedianMode {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        int sum = 0;
        
        //input values
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
            sum += array[i];
        }

        //sort array
        Arrays.sort(array);

        //mean
        float mean = 0;
        for (int i = 0; i < n; i++) {
            mean += array[i];
        }
        mean /= n;

        //median
        float median;
        int half = (n - 1) / 2;
        if ((n - 1) % 2 == 0) {
            median = array[half];
        } else {
            median = (float) (array[half] + array[half + 1]) / 2;
        }

        //mode
        int mode = 0, repeat = 0;
        for (int i = 0; i < (n - 1); i++) {
            if (array[i] == array[i + 1]) {
                repeat += 1;
                if(mode < repeat)
                    mode = i;
            } else {
                repeat = 0;
            }
        }


        //print mean, median, mode
        System.out.println(mean);
        System.out.println(median);
        System.out.println(array[mode]);
    }
}