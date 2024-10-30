/*Complete the solution so that it reverses the string passed into it.

'world'  =>  'dlrow'
'word'   =>  'drow' */

public class Kata {

  public static String solution(String str) {
        String finalString = "";
        char[] array = str.toCharArray();
        for (int i = array.length - 1;i >= 0;i--){
            finalString += array[i];
        }
    return finalString;
  }

}
