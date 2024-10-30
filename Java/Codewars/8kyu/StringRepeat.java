//Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.

public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder result = new StringBuilder("");
        for (int i =0;i < repeat;i++) {
        	result.append(string);
        }
        return result.toString();
    }
}
