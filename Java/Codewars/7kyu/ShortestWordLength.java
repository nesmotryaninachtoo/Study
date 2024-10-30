/*Simple, given a string of words, return the length of the shortest word(s).
String will never be empty and you do not need to account for different data types. */

public class Kata {
    public static int findShort(String s) {
        String[] array = s.split(" ");
        int length = array[0].length();
        int temp = 0;
        for (int i = 0;i < array.length - 1;i++){
            if (array[i].length() <= array[i + 1].length()){
                temp = array[i].length();
                if (temp <= length){
                    length = temp;
                }
            }
            else {
                temp = array[i + 1].length();
                if (temp <= length){
                    length = temp;
                }
            }
        }
        return length;
    }
}
