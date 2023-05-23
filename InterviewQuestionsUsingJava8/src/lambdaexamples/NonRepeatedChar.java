package lambdaexamples;

import java.util.*;

public class NonRepeatedChar {
    public static void main(String[] args) {

        String str = "Nikhil";
        List<Character> result = findNonRepeatedCharacters(str);
        System.out.println(result);

//        Optional<Character> nonRepeatedChar = str.chars()
//                .mapToObj(ch -> (char) ch)
//                .filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch))
//                .findAny();
//        nonRepeatedChar.ifPresent(System.out::println);


    }


    public static List<Character> findNonRepeatedCharacters(String str) {
        Map<Character, Integer> charCounts = new LinkedHashMap<>();
        List<Character> nonRepeatingChars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            if (entry.getValue() == 1) {
                nonRepeatingChars.add(entry.getKey());
            }
        }
        return nonRepeatingChars;
    }





}
