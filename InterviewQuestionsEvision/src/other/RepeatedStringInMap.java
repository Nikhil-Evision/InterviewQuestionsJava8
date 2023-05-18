package other;
import java.util.*;
public class RepeatedStringInMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "five");
        map.put(4, "Two");

        List<String> searchValues = Arrays.asList("Two", "Four");

        List<Integer> keys = new ArrayList<>();
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            if(searchValues.contains(entry.getValue())){
                keys.add(entry.getKey());
//                map.remove(entry.getKey());
            }
        }
        System.out.println(keys);
        for(Integer i : keys){
            map.remove(i);
        }
        System.out.println(map);

    }
}
