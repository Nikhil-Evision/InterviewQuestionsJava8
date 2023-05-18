package demo;
import java.util.*;

public class RepeatedString {
    public static void main(String[] args) {
        String str = "Nikhil";
        List<Character> result = findDuplicateList(str);
        System.out.println(result);
    }

    public static List<Character> findDuplicateList(String str){
        Map<Character,Integer> charCount = new LinkedHashMap<>();
        List<Character> nonRepeatingCharacters = new ArrayList<>();
        for(int i =0;i<str.length();i++){
            char c = str.charAt(i);
            charCount.put(c, charCount.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : charCount.entrySet()){
            if(entry.getValue()==1){
                nonRepeatingCharacters.add(entry.getKey());
            }
        }
        return nonRepeatingCharacters;
    }
}
