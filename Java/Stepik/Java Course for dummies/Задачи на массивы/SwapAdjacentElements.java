import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        String temp ="";
        while (sc.hasNext()){
            str += sc.next() + " ";
        }
        String[] arrayOfString = str.split(" ");
        if (arrayOfString.length % 2 == 0){
            for (int i = 1;i < arrayOfString.length - 1 ;i+=2){
                temp = arrayOfString[i];
                arrayOfString[i] = arrayOfString[i + 1];
                arrayOfString[i + 1] = temp;
            }
        }
        else {
            for (int z = 1;z < arrayOfString.length - 2 ;z+=2){
                temp = arrayOfString[z];
                arrayOfString[z] = arrayOfString[z + 1];
                arrayOfString[z + 1] = temp;
                
            }
        }

        for (int j = 0;j < arrayOfString.length;j++){
            System.out.print(arrayOfString[j] + " ");

        }
    }
}
