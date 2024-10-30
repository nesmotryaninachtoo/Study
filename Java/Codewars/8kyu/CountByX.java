/*Create a function with two arguments that will return an array of the first n multiples of x.
Assume both the given number and the number of times to count will be positive numbers greater than 0.
Return the results as an array or list ( depending on language ).*/

public class Kata{
  public static int[] countBy(int x, int n){
    int[] array = new int [n];
    for (int i = 0;i < array.length;i++){
      if (i == 0){
        array[i] = x;
      }
      else {
        array[i] = x * (i+1);
      }
      
    }
    return array;
  }
}
