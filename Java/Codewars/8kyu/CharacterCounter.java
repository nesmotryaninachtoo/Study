/*Create a function that accepts a string and a single character, and returns an integer of the count of occurrences the 2nd argument is found in the first one.
If no occurrences can be found, a count of 0 should be returned. */

public class CodeWars {
    public static int strCount(String str, char letter) {
        int count = 0;
        char[] array = str.toCharArray();
        for (int i = 0;i < array.length;i++){
            if (array[i] == letter){
                count++;
            }
        }
        return count;
    }
}
