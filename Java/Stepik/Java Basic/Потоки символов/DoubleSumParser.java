import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double result = 0;
        while (sc.hasNext()){
            try{
               result += Double.parseDouble(String.valueOf(sc.next()));
            } catch (NumberFormatException ignored) {
               
            }
        }
        String formattedDouble = new DecimalFormat("#0.000000").format(result);

        System.out.write(formattedDouble.getBytes());
    }
}
