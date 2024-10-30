/*Write a method, that gets an array of integer-numbers and return an array of the averages
of each integer-number and his follower, if there is one.
If the array has 0 or 1 values or is null, your method should return an empty array. */

public class Kata
{
    public static double[] averages(int[] numbers)
    {
        if (numbers == null || numbers.length == 0 || numbers.length == 1) {
            return new double[0];
        }
        double[] array = new double[numbers.length - 1];
        for (int i = 0;i < array.length;i++){
            array[i] = (numbers[i] + numbers[i + 1]) / 2.0;
        }
        return array;
    }
}
