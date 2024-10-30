import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (sc.hasNext()){
            str += sc.next() + " ";
        }
        String[] arrayOfString = str.split(" ");
        int [] arrayOfInt = new int [arrayOfString.length];
        for (int i = 0; i < arrayOfInt.length; i++) {
            arrayOfInt[i] = Integer.parseInt(arrayOfString[i]);
        }
        Arrays.sort(arrayOfInt);
        System.out.println(Arrays.toString(arrayOfInt));
    }
}

