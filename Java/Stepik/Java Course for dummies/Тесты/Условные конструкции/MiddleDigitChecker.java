import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Math.abs(sc.nextInt());
        int digit = sc.nextInt();
        String numberAsString = String.valueOf(number);
        char middleDigitchar = numberAsString.charAt(1);
        int middleDigit = Character.getNumericValue(middleDigitchar);
        if (numberAsString.length() == 3){
            if (middleDigit == digit) {
                System.out.println(true);
            }
            else {
                System.out.println(false);
            }
        }
        else {
            System.out.println("error");
        }

    }
}
