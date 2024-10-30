import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstLine = sc.nextLine();
        int firstChar = firstLine.charAt(0);
        int secondChar = firstLine.charAt(2);
        while (sc.hasNext()){
            String currentLine = sc.next();
            int thirdChar = currentLine.charAt(0);
            if ((firstChar >= thirdChar && secondChar <= thirdChar) ||
                    (secondChar >= thirdChar && firstChar <= thirdChar)){
                System.out.println(currentLine);
            }
        }
    }
}
