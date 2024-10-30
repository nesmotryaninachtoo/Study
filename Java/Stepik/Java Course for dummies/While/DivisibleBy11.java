import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            int number = sc.nextInt();
            if (number % 11 != 0) {
                break;
            }
            else {
                count++;
            }
            if (number % 3 == 0){
                sum += number;
            }
        }
        System.out.println(count);
        System.out.println(sum);
    }
}
