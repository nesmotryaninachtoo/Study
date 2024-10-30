//In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

import java.util.Arrays;

public class Kata {
    public static String highAndLow(String numbers) {
        String[] array = numbers.split(" ");
        int[] arrayOfInt = new int[array.length];
        for (int i = 0; i < array.length;i++){
            arrayOfInt[i] = Integer.parseInt(array[i]);
        }
        Arrays.sort(arrayOfInt);
        return arrayOfInt[array.length - 1] + " " +  arrayOfInt[0] ;
    }
}
