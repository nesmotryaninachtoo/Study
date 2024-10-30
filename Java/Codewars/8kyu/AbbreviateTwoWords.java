//Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
//The output should be two capital letters with a dot separating them.

import java.util.Locale;

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        String[] arr = name.toUpperCase(Locale.ROOT).split(" ");
        return arr[0].charAt(0) + "." + arr[1].charAt(0);
    }
}
