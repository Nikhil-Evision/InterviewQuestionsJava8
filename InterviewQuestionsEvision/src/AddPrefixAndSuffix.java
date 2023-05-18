import java.util.*;
import java.util.stream.Collectors;

public class AddPrefixAndSuffix {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "orange");
        List<String> modifiedList = addPrefixAndSuffix(list, "fruits: ", "!");
        System.out.println(modifiedList);

    }
    public static List<String> addPrefixAndSuffix(List<String> list, String prefix, String suffix) {
        return list.stream()
                .map(str -> prefix + str + suffix)
                .collect(Collectors.toList());
    }

}
