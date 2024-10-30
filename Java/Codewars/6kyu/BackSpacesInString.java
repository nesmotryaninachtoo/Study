//Assume "#" is like a backspace in string. This means that string "a#bc#d" actually is "bd"

import java.util.ArrayList;
import java.util.ListIterator;

public class BackspacesInString {
    public String cleanString(String s) {
        ArrayList<Character> list = new ArrayList<>();
        char[] arrayOfChar = s.toCharArray();
        for (char c : arrayOfChar) {
            list.add(c);
        }
        ListIterator<Character> listIterator = list.listIterator();
        int i = 0;
        while (listIterator.hasNext() && i < list.size()){
            if (String.valueOf(list.get(i)).equals("#")){
                list.remove(i);
                if (i >= 1){
                    list.remove(i - 1);
                }
                i = 0;
            }
            i++;
        }
        String resultString = "";
        for (int j = 0;j < list.size();j++){
            resultString += String.valueOf(list.get(j));
        }
        return resultString.replaceAll("#", ""); //hardcoded works in ide without this, but here tests does not accepting
    }
}
