import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        int id = 0;
        while (sc.hasNext()){
            str += sc.next() + " ";
        }
        String[] arrayOfString = str.split(" ");
        int length = arrayOfString[0].length();
        for (int i = 0;i < arrayOfString.length - 1;i++){
            if (length > arrayOfString[i + 1].length()){
                length = arrayOfString[i + 1].length();
                id = i + 1;
            }
        }
        System.out.println(id + 1);
    }
}


