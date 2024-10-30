import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int a1 = -1;
        int b1 = -1;
        int c1 = -1;

        if (a % 2 == 0){
            a1 = a;
        }
        if (b % 2 == 0){
            b1 = b;
        }
        if (c % 2 == 0){
           c1 = c;
        }

        if (a % 2 != 0 && b % 2 != 0 && c % 2 != 0){
            System.out.println("Чётных чисел нет");
        }
        else if (a1 >= b1 && a1 >= c1) {
                System.out.println(a1);
        }
        else if (b1 >= a1 && b1 >= c1) {
                System.out.println(b1);
        }
        else if(c1 >= a1 && c1 >= b1) {
                System.out.println(c1);
        }





    }
}
