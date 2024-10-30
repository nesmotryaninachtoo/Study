import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle = sc.nextInt();
        double radians = Math.toRadians(angle);
        double total = Math.sin(radians) + Math.cos(radians);
        System.out.print(total);
    }
}
