//Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
//For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)

public class SquareDigit {
    public int squareDigits(int n) {
        String num = String.valueOf(n);
        String result = "";
        for (int i = 0;i < num.length();i++){
            result += (int)Math.pow((Integer.parseInt(String.valueOf(num.charAt(i)))),2);
        }
        return Integer.parseInt(result);
    }
}
