import java.util.Scanner;

import static java.lang.Character.getNumericValue;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        char [] formattedNumber = number.toCharArray();
        int max = getNumericValue(formattedNumber[0]);
        for (int i = 0;i < number.length() - 1;i++) {
            if (getNumericValue(formattedNumber[i + 1]) >= max || getNumericValue(formattedNumber[i]) >= max) {
                if (getNumericValue(formattedNumber[i + 1]) > getNumericValue(formattedNumber[i])) {
                    max = getNumericValue(formattedNumber[i + 1]);
                } else {
                    max = getNumericValue(formattedNumber[i]);
                }
            }
        }
        System.out.print(max);
    }
}
