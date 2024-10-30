/*You are going to be given a word. Your job is to return the middle character of the word.
If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters. */

class Kata {
    public static String getMiddle(String word) {
        char[] array = word.toCharArray();
        if (array.length % 2 == 0) {
            return String.valueOf(array[array.length / 2 - 1]) + String.valueOf(array[array.length / 2]);
        } else {
            return String.valueOf(array[array.length / 2]);
        }
    }
}
