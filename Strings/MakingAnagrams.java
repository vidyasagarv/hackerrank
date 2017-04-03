import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class MakingAnagrams {
    public static int numberNeeded(String first, String second) {
      int charFreq[] = new int[26];
      int numberReturned = 0;
      for(int i = 0; i< first.length(); i++){
          charFreq[Character.toLowerCase(first.charAt(i))-'a']++;
      }
      for(int i = 0; i< second.length(); i++){
          charFreq[Character.toLowerCase(second.charAt(i))-'a']--;
      }
      for(int i = 0; i< charFreq.length; i++){
          numberReturned += Math.abs(charFreq[i]);
      }
      return numberReturned;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
