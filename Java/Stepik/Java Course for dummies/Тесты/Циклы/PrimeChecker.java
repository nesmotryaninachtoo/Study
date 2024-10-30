import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        if (num < 2) {
            System.out.print(false);
        } else {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2){
                System.out.print(true);
            }
            else {
                System.out.print(false);
            }
        }
    }
}
