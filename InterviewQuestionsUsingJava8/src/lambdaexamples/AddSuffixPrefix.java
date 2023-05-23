package lambdaexamples;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class AddSuffixPrefix {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("apple", "banana", "cat", "dog");
        List<String> modifiedStrings = strings.stream()
                .map(s -> "Prefix_" + s + "_Suffix")
                .collect(Collectors.toList());
        System.out.println(modifiedStrings);

//        StringJoiner sj = new StringJoiner(", ","prefix","suffix");
//        for(String s : strings){
//            sj.add(s);
//        }
//        String sjr = sj.toString();
//        System.out.println(sjr);

    }
}
