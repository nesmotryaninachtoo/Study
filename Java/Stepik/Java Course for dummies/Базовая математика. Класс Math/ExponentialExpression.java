import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double n = sc.nextDouble();
        double total = Math.abs((Math.pow(x,y/n)));
        double scale = Math.pow(10, 5);
        System.out.println(Math.round(total * scale) / scale);
    }
}
