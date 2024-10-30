import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            for (int i = 2;i <= 5;i++){
                int raisedToPow = (int)Math.pow (num,i);
                if (i != 5){
                    System.out.print(raisedToPow + " ");
                }
                else {
                    System.out.print(raisedToPow + "\n");
                }
            }
        }
    }
}
