/*Complete the function that takes a non-negative integer n as input,
and returns a list of all the powers of 2 with the exponent ranging from 0 to n ( inclusive ). */

public class Kata{
    public static long[] powersOfTwo(int n){
        long[] array = new long[n + 1];
        for (int i = 0;i < array.length;i++ ){
          if (i == 0){
            array[i] = (long)Math.pow(1,2);
          }
          else {
            array[i] += array [i - 1] * 2;
          }
            
        }
        return array;
    }
}
