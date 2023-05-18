package demo;
import java.util.*;
public class SortAccordingLength{
    public static void main(String[] args) {
        List<String> list=  new ArrayList<>();
        list.add("nikhil");
        list.add("Nitish sing");
        list.add("Hello World ");
        list.add("Hey bro ");
        System.out.println(list);

        list.sort(Comparator.comparingInt(String::length));
        System.out.println(list);
    }
}
