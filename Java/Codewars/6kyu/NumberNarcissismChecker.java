/*A Narcissistic Number (or Armstrong Number) is a positive number which is the sum of its own digits,
each raised to the power of the number of digits in a given base.
In this Kata, we will restrict ourselves to decimal (base 10).
Your code must return true or false (not 'true' and 'false') depending upon whether the given number is a Narcissistic number in base 10. */

public class NumberUtils {

    public static boolean isNarcissistic(int number) {
        String num = String.valueOf(number);
        char[] array = num.toCharArray();
        int i = 0;
        int result = 0;
        while (i < num.length()){
            result += Math.pow(((Integer.parseInt(String.valueOf(array[i])))), num.length());
            i++;
        }
        return result == number;
    }
}
