import java.io.*;
import java.util.*;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        
        // Complete the function by writing your code here.
        int[] letters = new int[26];
        if(a.length() != b.length()){
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        int aVal = Character.getNumericValue('a');
        for(int i = 0; i < a.length(); ++i){
            letters[Character.getNumericValue(a.charAt(i))-aVal]++;
            letters[Character.getNumericValue(b.charAt(i))-aVal]--;
        }
        
        for(int i = 0; i < 26; ++i){
            if(Math.abs(letters[i]) > 0){
                return false;
            }
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}