import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortIntegerList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//      adding data into list
        list.add(8);
        list.add(10);
        list.add(4);
        list.add(2);
        list.add(55);
        list.add(18);

        System.out.println("Available List : "+ list);

//      Sorting using Static method of Collections Class
        Collections.sort(list);
        System.out.println("Sorted list : "+ list);

    }
}
