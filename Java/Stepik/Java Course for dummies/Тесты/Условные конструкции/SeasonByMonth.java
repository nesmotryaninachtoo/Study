import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        if (month >=1 && month <= 12){
            if (month == 1 || month == 2 || month == 12){
                System.out.println("Зима");
            }
            else if (month == 3 || month == 4 || month == 5){
                System.out.println("Весна");
            }
            else if (month == 6 || month == 7 || month == 8){
                System.out.println("Лето");
            }
            else {
                System.out.println("Осень");
            }
        } else {
            System.out.println("error");
        }

    }
}
