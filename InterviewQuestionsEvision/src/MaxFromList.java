import java.util.Arrays;
import java.util.List;

public class MaxFromList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 5, 1, 7, 2, 9);
        int max = findMax(list);
        System.out.println(max); // prints 9

    }

    public static int findMax(List<Integer> list) {
        int max = Integer.MIN_VALUE;

        for (int item : list) {
            if (item > max) {
                max = item;
            }
        }

        return max;
    }

}
