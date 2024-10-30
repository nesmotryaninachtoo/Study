//Write a function that returns both the minimum and maximum number of the given list/array.

import java.util.Arrays;
import java.util.Collections;

class MinMax {
    public static int[] minMax(int[] arr) {
    	int min = Arrays.stream(arr).min().getAsInt();
    	int max = Arrays.stream(arr).max().getAsInt();
    	int [] finalArray = {min, max};
    	return finalArray;
    }
}
