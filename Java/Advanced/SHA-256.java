import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.*;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException{
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        scan.close();
        
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(str.getBytes());
        byte[] digest = md.digest();
        
        // Print the encoded value in hexadecimal
        for (byte b : digest) {
            System.out.format("%02x", b);
        }
    }
}