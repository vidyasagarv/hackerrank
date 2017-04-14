import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException{
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        byte[] byteMessage = s.getBytes();
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] encryptedBytes = md.digest(byteMessage);
        for(byte b : encryptedBytes){
            System.out.format("%02x",b);
        }
    }
}