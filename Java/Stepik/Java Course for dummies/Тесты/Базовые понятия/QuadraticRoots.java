import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextFloat();
    double b = sc.nextFloat();
    double c = sc.nextFloat();
    double sum =  -b / a;
    double multipl =  c / a;
    System.out.println(sum + " " + multipl);
    }
}
