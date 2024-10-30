import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    int charNumber = sc.nextInt();
    System.out.println(text.charAt(charNumber-1));


    }
}
