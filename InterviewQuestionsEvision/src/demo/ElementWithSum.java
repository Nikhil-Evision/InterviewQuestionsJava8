package demo;
public class ElementWithSum {
    public static Integer findElementWithSum(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == arr[i - 1] + arr[i + 1]) {
                return arr[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] myList = {1, 4, 3, 6, 10, 5, 7};
        Integer result = findElementWithSum(myList);
        if (result != null) {
            System.out.println("The element in the list that is the sum of its left and right elements is: " + result);
        } else {
            System.out.println("No such element found.");
        }
    }
}
