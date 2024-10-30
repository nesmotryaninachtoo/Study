//Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

public class Kata {
    public static int[] digitize(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        sb.reverse();
        int[] array = new int[sb.length()];
        for (int i = 0;i < array.length;i++){
            array[i] = Integer.parseInt(String.valueOf(sb.charAt(i)));
        }
        return array;
    }
}
