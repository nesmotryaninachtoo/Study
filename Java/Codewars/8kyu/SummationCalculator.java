//Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0.

public class GrassHopper {

    public static int summation(int n) {
        int sum = 0;
        for (int i = 0;i <= n;i++){
          sum += i;
        }
      return sum;
    }   
}
