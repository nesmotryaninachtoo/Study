import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String num1 = String.valueOf(num);

        if (num1.startsWith("-") || num1.length() !=3){
            System.out.println("NO");
        }

        if (num1.length() == 3){
            System.out.println("YES");
        }
    }
}
