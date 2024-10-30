/* An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines
  whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case. */

public class isogram {
    public static boolean  isIsogram(String str) {
        for (int i = 0;i < str.length() - 1;i++){
            for (int j = i + 1; j < str.length();j++){
                if (str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}
