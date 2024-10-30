import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();

       
        if (b1 < a2 || b2 < a1) {
            System.out.println("Пересечения нет");
        } else {
  
            int intersectionStart = Math.max(a1, a2);
            int intersectionEnd = Math.min(b1, b2);

            if (intersectionStart == intersectionEnd) {
                System.out.println(intersectionStart);
            } else {
                System.out.println(intersectionStart + " " + intersectionEnd);
            }
        }
    }
}





