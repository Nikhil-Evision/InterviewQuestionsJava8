package demo;
import java.util.*;
public class FindPairFromTheList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,5,3,1,2,3,4,5,3,4,5,3,2,8);
        Map<Integer,Integer> hasMap = new LinkedHashMap<>();
        List<Integer> listOfPairs = new ArrayList();
        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            hasMap.put(list.get(i),(hasMap.getOrDefault(i,0)+1));
        }
        System.out.println(hasMap);

    }

  }
