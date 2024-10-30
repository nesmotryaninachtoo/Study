//Write a function that returns both the minimum and maximum number of the given list/array. 

import java.util.Arrays;

class MinMax {
    public static int[] minMax(int[] arr) {
        int[] array = new int[2];
        Arrays.sort(arr);
        if (arr.length == 1){
            array[0] = arr[0];
            array[1] = arr[0];
        } else{
            array[0] = arr[0];
            array[1] = arr[arr.length - 1];
        }
        return array;

    }
}
