import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num <= 10 && num > 0){
            double scale = Math.pow(10, num);
            System.out.println(Math.round(Math.PI * scale) / scale);
        }
        else if (num == 0){
            System.out.printf("%.0f%n", Math.PI);
        }
    }
}
