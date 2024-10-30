//You ask a small girl,"How old are you?" She always says, "x years old", where x is a random number between 0 and 9.
//Write a program that returns the girl's age (0-9) as an integer.

public class CharProblem {
    public static int howOld(final String herOld) {
      return Integer.parseInt(String.valueOf(herOld.charAt(0)));   
    }
}
