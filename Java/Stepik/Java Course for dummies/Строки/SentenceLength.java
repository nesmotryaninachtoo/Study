import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    String text2 = sc.nextLine();
    String text3 = text + " " + text2;
    System.out.println(text3);
    System.out.println(text3.length());

    }
}
