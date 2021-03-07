package Java3_HW_1_2;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoArraysMethod {
    static String [] arr1 = new String[5];

    static void changePlaces(String[] arr, int index1, int index2){
        if (index1 >= arr.length || index2 >= arr.length) {
            throw new IndexOutOfBoundsException();
        }else {
            String str = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = str;
        }
    }
    static ArrayList<String> arrayToArrayList(String[] arr){
        return (ArrayList<String>) Arrays.asList(arr);
    }


}
