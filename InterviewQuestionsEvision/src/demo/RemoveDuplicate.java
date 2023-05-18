package demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1,2,3,4,5,2,3,4,1,7,6);
        List<Integer> removedList = num.stream().distinct().collect(Collectors.toList());
        System.out.println(removedList);
    }
}
