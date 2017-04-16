import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<List<Integer>> list = new ArrayList<>();// a list to store all lists
        int n = in.nextInt();

        for(int i = 0; i < n; i++){
            List<Integer> sub = new ArrayList<>();
            int d = in.nextInt();// number of elements in each line
            sub.add(d);
            for(int j = 0; j < d;j++){
                sub.add(in.nextInt());
            }
            list.add(sub);
        }

        int q = in.nextInt();
        int x,y;
        for(int i = 0; i < q;i++){
            x = in.nextInt();
            y = in.nextInt();
            if(list.get(x-1).get(0) < y){
                System.out.println("ERROR!"); //check index out of bounds
            }else{
                System.out.println(list.get(x-1).get(y)); //access like a 2D array
            }
        }
    }
}