
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortListByCount {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 2, 4, 5, 12, 2, 3, 3, 12, 5, 7, 7, 9, 9);

        // Step 1: Create a frequency map using streams
        Map<Integer, Long> frequencyMap = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(frequencyMap);
        // Step 2: Sort the list using the frequency map as a comparator
        numbers.sort((a, b) -> {
            int result = frequencyMap.get(b).compareTo(frequencyMap.get(a));
            return result != 0 ? result : Integer.compare(a, b);
        });

        // Step 3: Print the sorted list
        System.out.println("Sorted list: " + numbers);
    }
}


