//Given an integral number, determine if it's a square number

public class Square {
    public static boolean isSquare(int n) {
        if (n < 0){
            return false;
        }
        if (n == (int) Math.sqrt(n) * (int) Math.sqrt(n) ){
            return true;
        }        
        return false;
    }
}
