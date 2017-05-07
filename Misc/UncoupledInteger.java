import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UncoupledInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] integers = input.split(", ");
        int unpaired = 0;
        for(String str: integers)
            unpaired = unpaired ^ Integer.parseInt(str);
        System.out.println(unpaired);
    }
}