import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        double perimeter = a + b + c;
        System.out.print(Math.round(perimeter) * 1.0);
    }
}
