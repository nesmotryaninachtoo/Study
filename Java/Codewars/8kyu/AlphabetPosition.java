//When provided with a letter, return its position in the alphabet.

public class Kata
{
    public static String position(char alphabet)
    {
        int position = (int)alphabet - 96;
        return "Position of alphabet: " + position;
    }
}
