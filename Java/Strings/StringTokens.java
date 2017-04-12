import java.io.*;
import java.util.*;
public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        if(s.length() == 0){
            System.out.println(0);
            return;
        }
        // Write your code here.
        String[] tokens = s.split("[ !,?._'@]+");
        System.out.println(tokens.length);
        Arrays.asList(tokens).forEach(System.out :: println);
        scan.close();
    }
}