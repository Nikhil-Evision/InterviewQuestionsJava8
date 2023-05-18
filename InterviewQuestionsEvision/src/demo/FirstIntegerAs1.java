package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstIntegerAs1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(210,1,11,120,55,23,16,18,21);
        for(Integer i : list){
            if(String.valueOf(i).charAt(0)=='1'){
                System.out.println(i);
                break;
            }
        }
    }
}
