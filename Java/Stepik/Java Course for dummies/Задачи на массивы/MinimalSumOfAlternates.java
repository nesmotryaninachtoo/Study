import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        int temp = 0;
        while (sc.hasNext()){
            str += sc.next() + " ";
        }
        String[] arrayOfString = str.split(" ");
        int [] arrayOfInt = new int [arrayOfString.length];
        for (int i = 0; i < arrayOfInt.length; i++) {
            arrayOfInt[i] = Integer.parseInt(arrayOfString[i]);
        }

        if (arrayOfInt.length <= 2){
            System.out.print("0");
        }
        else {
            int sum = arrayOfInt[0] + arrayOfInt[2];
            for (int i = 0; i < arrayOfInt.length - 2; i++){
                temp = arrayOfInt[i] + arrayOfInt[i + 2];
                if (temp < sum){
                    sum = temp;
                }
            }
            System.out.println(sum);
        }

    }
}
