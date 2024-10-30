import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if(y <= (2-x*x) && (y >= x || y >= 0)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }


    }
}
