package demo;

import java.util.*;
public class FindKeyForThatComment {

        public static void main(String[] args) {
            Map<Integer, String> map = new HashMap<>();
            map.put(1, "One");
            map.put(2, "Two");
            map.put(3, "five");
            map.put(4, "Two");

            List<String> searchValues = Arrays.asList("Two", "Four");

            Set<Integer> keys = findKeys(map, searchValues);
            System.out.println("Keys containing the search values: " + keys);
        }

        public static Set<Integer> findKeys(Map<Integer, String> map, List<String> searchValues) {
            Set<Integer> keys = new HashSet<>();
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if (searchValues.contains(entry.getValue())) {
                    keys.add(entry.getKey());
                }
            }
            return keys;
        }
    }


