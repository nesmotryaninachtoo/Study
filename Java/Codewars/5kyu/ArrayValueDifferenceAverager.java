/*Complete the function that
    accepts two integer arrays of equal length
    compares the value each member in one array to the corresponding member in the other
    squares the absolute value difference between those two values
    and returns the average of those squared absolute value difference between each member pair. */

public class Solution {
    public static double solution(int[] arr1, int[] arr2) {
        double sum = 0;
        for (int i = 0;i < arr1.length;i++){
            sum += Math.pow(Math.abs(arr1[i] - arr2[i]),2);
        }
        return sum / arr1.length;
    }
}
