import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            for(int i = 1; i <= n; i++){
                String result = "";
                if(i%3 == 0){
                    result += "Fizz";
                }
                if(i%5 == 0){
                    result += "Buzz";
                }
                if(result.equals("")){
                    result += i;
                }
                System.out.println(result);
            }
        }
    }
}