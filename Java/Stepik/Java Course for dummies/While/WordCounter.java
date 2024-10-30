import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        while (sc.hasNext()) {
            String str = sc.next();
            counter++;
        }
        System.out.println(counter);
    }
}
