import java.util.Scanner;
import java.util.Arrays;

public class Quartiles {
    
    public static void main(String[] args) {
        int[] array = getInput();
        Arrays.sort(array);
        
        int q1 = findMedian(array, 0, array.length / 2 - 1);
        int q2 = findMedian(array, 0, array.length - 1);
        int q3 = findMedian(array, (array.length + 1) / 2, array.length - 1);
        
        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
    }

    private static int findMedian(int [] array, int start, int end) {
        if ((end - start) % 2 == 0) { // odd number of elements
            return (array[(end + start) / 2]);
        } else { // even number of elements
            int value1 = array[(end + start) / 2];
            int value2 = array[(end + start) / 2 + 1];
            return Math.round((value1 + value2) / 2); 
        }
    }
    
    private static int [] getInput() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();
        return array;
    }
}