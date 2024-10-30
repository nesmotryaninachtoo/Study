/*Given an array of integers.
Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.
0 is neither positive nor negative.
If the input is an empty array or is null, return an empty array.*/

public class Kata
{
    public static int[] countPositivesSumNegatives(int[] input)
    {
        int[] nullArray = new int[0];
        int[] array = new int[2];
        if (input == null || input.length == 0) {
            return nullArray;
        }
        int count = 0;
        int sum = 0;
        for (int i = 0; i < input.length;i++){
            if (input[i] > 0){
                count++;
            }
            else {
                sum += input[i];
            }
        }
        array[0] = count;
        array[1] = sum;
        return array;
    }
}
