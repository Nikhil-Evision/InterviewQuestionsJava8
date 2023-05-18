import java.util.Arrays;

public class SortIntegerArray {
    public static void main(String[] args) {
        int array [] = new int[]{1,22,33,23,19,56,16};
        System.out.println("Given Array : "+ Arrays.toString(array));

//                Sorting using for loop
        for(int i=0; i< array.length; i++){
            for(int j=0;j< array.length;j++){
                if(array[j]>array[i]){
                    int temp = array[i];
                    array[i]= array[j];
                    array[j]=temp;
                }
            }
        }
//        printing the sorted array
        System.out.println("Sorted array : "+ Arrays.toString(array));
    }
}
