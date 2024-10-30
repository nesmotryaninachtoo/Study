import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String word = sc.nextLine();
        if (str.toLowerCase().contains(word.toLowerCase())){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }
}
