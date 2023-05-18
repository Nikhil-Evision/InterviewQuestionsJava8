package demo;
import java.util.*;
    public class FrequencySort {
        public static int[] sortByFrequency(int[] arr) {
            // Step 1: Create a HashMap to store the frequencies
            Map<Integer, Integer> frequencyMap = new HashMap<>();

            // Step 2: Update the frequency count in the HashMap
            for (int num : arr) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }

            // Step 3: Create a custom Comparator
            Comparator<Integer> frequencyComparator = new Comparator<Integer>() {
                @Override
                public int compare(Integer a, Integer b) {
                    int freqCompare = frequencyMap.get(b).compareTo(frequencyMap.get(a));
                    if (freqCompare == 0) {
                        // If the frequencies are equal, sort by value in ascending order
                        return a.compareTo(b);
                    }
                    return freqCompare;
                }
            };

            // Step 4: Sort the array using the custom Comparator
            Arrays.sort(arr);

            // Step 5: Return the sorted array
            return arr;
        }

        public static void main(String[] args) {
            int[] arr = {4, 2, 2, 8, 3, 3, 1};
            int[] sortedArr = sortByFrequency(arr);
            System.out.println(Arrays.toString(sortedArr));
        }
    }


