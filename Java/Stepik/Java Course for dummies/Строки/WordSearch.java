import java.util.Scanner;

class MyProgram {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String text = sc.nextLine();
       String word = sc.nextLine();
       System.out.println(text.contains(word));
   }
}
