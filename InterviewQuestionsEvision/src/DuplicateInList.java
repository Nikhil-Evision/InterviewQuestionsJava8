import java.util.*;

public class DuplicateInList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "orange", "apple", "pear", "banana");
        List<String> duplicates = findDuplicates(list);
        System.out.println(duplicates);

    }

    public static <T> List<T> findDuplicates(List<T> list) {
        Set<T> seen = new HashSet<>();
        List<T> duplicates = new ArrayList<>();

        for (T item : list) {
            if (!seen.add(item)) {
                duplicates.add(item);
            }
        }

        return duplicates;
    }

}
