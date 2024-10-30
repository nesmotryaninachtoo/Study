/*Can you find the needle in the haystack?
Write a function findNeedle() that takes an array full of junk but containing one "needle" */

public class Kata {
    public static String findNeedle(Object[] haystack) {
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] != null && haystack[i] instanceof String && haystack[i].equals("needle")) {
                return "found the needle at position " + i;
            }
        }
        return null;
    }
}
