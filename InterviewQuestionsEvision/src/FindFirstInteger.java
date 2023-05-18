public class FindFirstInteger {
    public static void main(String[] args) {
        int[] arr = {20,100, 21, 32, 13, 42, 15};
        int result = findFirstIntegerStartingWithOne(arr);
        System.out.println(result);

    }

    public static int findFirstIntegerStartingWithOne(int[] arr) {
        for (int i : arr) {
            if (String.valueOf(i).charAt(0) == '1') {
                return i;
            }
        }

        throw new RuntimeException("No integer starting with 1 found.");
    }

}
