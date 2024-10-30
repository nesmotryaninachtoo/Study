//Complete the solution so that the function will break up camel casing, using a space between words.

class Solution {
    public static String camelCase(String input) {
        StringBuilder sb = new StringBuilder(input);
        for (int i = 0;i < sb.length();i++){
            if (Character.isUpperCase(sb.charAt(i))) {
                sb.insert(i, " ");
                i++;
            }
        }
        return sb.toString();
    }
}
