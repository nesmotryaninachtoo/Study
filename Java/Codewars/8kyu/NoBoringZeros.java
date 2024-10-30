/*Numbers ending with zeros are boring.
  They might be fun in your world, but not here.
  Get rid of them. Only the ending ones.
  Zero alone is fine, don't worry about it. Poor guy anyway */

public class NoBoring {
    public static int noBoringZeros(int n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        int length = sb.length();
        if (n == 0){
            return 0;
        } else {
            for (int i = 0;i < length;i++){
                if (String.valueOf(sb.charAt(length - 1 - i)).equals("0")){
                    sb.deleteCharAt(length - 1 - i);
                }
                else {
                    break;
                }
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
