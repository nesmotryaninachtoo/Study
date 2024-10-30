import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        double number2 = sc.nextDouble();
        if (number > number2){
            System.out.println(">");
        }
        else if(number == number2){
            System.out.println("=");
        }
        else {
            System.out.println("<");
        }
    }
}
