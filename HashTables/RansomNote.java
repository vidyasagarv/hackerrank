import java.util.*;

public class RansomNote {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public Solution(String magazine, String note) {
        magazineMap = new HashMap<String, Integer>();
        noteMap = new HashMap<String, Integer>();
        
        populateMap(magazineMap, magazine);
        populateMap(noteMap, note);
    }
    
    public void populateMap(Map<String, Integer> wordMap, String words){
        String[] wordArray = words.split(" ");
        for(String s : wordArray){
            if(!wordMap.containsKey(s)){
                wordMap.put(s,1);
            } else{
                wordMap.put(s,wordMap.get(s)+1);
            }
        }
    }
    
    public boolean solve() {
        for(String s: noteMap.keySet()){
            if(!magazineMap.containsKey(s)){
                return false;
            }
            int magazineCount = magazineMap.get(s);
            int noteCount = noteMap.get(s);
            if(noteCount > magazineCount){
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
