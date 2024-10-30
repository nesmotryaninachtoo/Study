/*Your task is to sort a given string. Each word in the string will contain a single number.
This number is the position the word should have in the result.
Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers. */

public class Order {
    public static String order(String words) {
        if (words.isEmpty()){
            return "";
        }
        String finalString = "";
        String[] originalWordsArray = words.split(" ");
        String[] finalWordsArray = new String[originalWordsArray.length];
        for (int i = 0;i < originalWordsArray.length;i++){
            for (int j = 0;j < originalWordsArray[i].length();j++){
                if (Character.isDigit(originalWordsArray[i].charAt(j))){
                    int position = Integer.parseInt(String.valueOf(originalWordsArray[i].charAt(j)));
                    finalWordsArray[position - 1] = originalWordsArray[i];
                }
            }
        }
        for (int z = 0;z < finalWordsArray.length;z++){
             finalString += finalWordsArray[z] + " ";
        }
        return finalString.trim();
    }
}
