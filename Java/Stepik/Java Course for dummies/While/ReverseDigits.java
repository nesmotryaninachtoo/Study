import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        int i = 1;
        while (i <= number.length()){
            char ch = number.charAt(number.length() - i);
            System.out.print(ch);
            i++;
        }
    }
}
