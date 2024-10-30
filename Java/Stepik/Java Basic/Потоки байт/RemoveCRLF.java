import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int currentNumber;
        int previousNumber = System.in.read();
        while (previousNumber != -1) {
            currentNumber = System.in.read();
            if (previousNumber != 13 || currentNumber != 10) {
                System.out.write(previousNumber);
            }
            previousNumber = currentNumber;
        }
        System.out.flush();
    }
}
