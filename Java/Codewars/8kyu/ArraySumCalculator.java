//I'm new to coding and now I want to get the sum of two arrays...
//Actually the sum of all their elements. I'll appreciate for your help.

public class Sum {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sumOfArrays = 0;
        for (int i = 0;i < arr1.length;i++){
            sumOfArrays+= arr1[i];
        }
        for (int j = 0;j < arr2.length;j++){
            sumOfArrays += arr2[j];
        }
        return sumOfArrays;
    }

}
