/*Write a function that takes an array of words and smashes them together into a sentence and returns the sentence.
You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word.
Be careful, there shouldn't be a space at the beginning or the end of the sentence! */

import java.util.Arrays;

public class SmashWords {

	public static String smash(String[] words) {
            // TODO Write your code below this comment please
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < words.length;i++){
                str.append(words[i]).append(" ");
            }
            return str.toString().trim();
        }
}
