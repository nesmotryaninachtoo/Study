//Given an array of integers, return a new array with each value doubled.

public class Maps {
  public static int[] map(int[] arr) {
  int[] finalArray = new int [arr.length];
  for (int i = 0;i < finalArray.length;i++){
    finalArray[i] = arr[i] * 2;
  }
    return finalArray;
  }
}
