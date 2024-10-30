/*In this example you have to validate if a user input string is alphanumeric. 
The given string is not nil/null/NULL/None, so you don't have to check that.
The string has the following conditions to be alphanumeric:
    1)At least one character ("" is not valid)
    2)Allowed characters are uppercase / lowercase latin letters and digits from 0 to 9
    3)No whitespaces / underscore */

public class SecureTester{
    public static boolean alphanumeric(String s){
        return s.length() > 0 && s.matches("[A-Za-z\\d]*$");
    }
}
