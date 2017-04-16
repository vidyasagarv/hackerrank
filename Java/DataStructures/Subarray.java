import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        
        int[] originalArray = new int[length];
        for (int i = 0; i < length; i++){
            originalArray[i] = scan.nextInt();
        }
        
        int totalCount = 0;
        
        int curSum = 0;
        for (int i = 0; i < length; i++){
            curSum = 0;
            for (int y = i; y < length; y++){
                curSum = curSum + originalArray[y];
                if (curSum < 0){
                    totalCount++;
                }
            }
        }
        
        System.out.println(totalCount);
    }
}