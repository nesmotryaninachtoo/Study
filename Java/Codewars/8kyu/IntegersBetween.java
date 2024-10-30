//Complete the function that takes two integers (a, b, where a < b)
//and return an array of all integers between the input parameters, including them.

public class Kata {

    public static int[] between(int a, int b) {
        int[] array = new int[Math.abs(a - b) + 1];
        for (int i = 0;i < array.length;i++){
            array[i] = Math.min(a,b) + i;
        }
        return array;
    }
}
