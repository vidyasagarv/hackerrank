import java.io.*;
import java.util.*;

public class StringCompare {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
        for(int i = 0; i < s.length() - n + 1; ++i){
            list.add(s.substring(i, i+n));
        }
        Collections.sort(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
    }
}