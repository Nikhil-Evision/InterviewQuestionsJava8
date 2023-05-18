import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStringListOnLength {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//      Inserting value in list
        list.add("Nikhil");
        list.add("Nilesh ranjan");
        list.add("Rahul tiwari");
        list.add("Mayank tomar");
        list.add("Durganshi chowdhari");

        System.out.println("List of String : "+list);


//        sorting list according to word count
        list.sort(Comparator.comparingInt(String::length));
        System.out.println(list);

    }
}
