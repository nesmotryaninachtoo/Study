//Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.

import java.util.List;

public class MixedSum {

    /*
     * Assume input will be only of Integer o String type
     */
    public int sum(List<?> mixed) {
        int sum = 0;
        for (int i =0;i < mixed.size();i++){
            sum += Integer.parseInt(String.valueOf(mixed.get(i)));
        }
        return sum;
    }
}
