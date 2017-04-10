import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountingInversions {
    

    public static long countInversions(int[] array){
        return mergesort(array, new int[array.length], 0, array.length-1);
	}

	public static long mergesort(int[] array, int[] temp, int leftStart, int rightEnd) {
        long inversions = 0;
		if (leftStart >= rightEnd) {
			return 0;
		}

		int middle = (leftStart + rightEnd)/2;
		inversions += mergesort(array, temp, leftStart, middle);
        inversions += mergesort(array, temp, middle + 1, rightEnd);
        inversions += mergeHalves(array, temp, leftStart, rightEnd);
        return inversions;
    }

	public static long mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd) {
		int leftEnd = (leftStart + rightEnd)/2;
		int rightStart = leftEnd + 1;
		int size = rightEnd - leftStart + 1;

        long invCount = 0;
		int left = leftStart;
		int right = rightStart;
		int index = leftStart;

		while(left <= leftEnd && right <= rightEnd) {
			if (array[left] <= array[right]) {
				temp[index++] = array[left++];
			} else {
				temp[index++] = array[right++];
                invCount = invCount + (leftEnd - left + 1);
			}
		}

		System.arraycopy(array, left, temp, index, leftEnd -  left + 1);
		System.arraycopy(array, right, temp, index, rightEnd - right + 1);
		System.arraycopy(temp, leftStart, array, leftStart, size);
        
        return invCount;
	}
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int arr[] = new int[n];
            for(int arr_i=0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            System.out.println(countInversions(arr));
        }
    }
    
    
}
