import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String diagonal = "";

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (!line.isEmpty()) {
                String[] numbers = line.split(" ");
                if (count < numbers.length) {
                    diagonal += (numbers[count] + " ");
                }
                count++;
            }
        }
        System.out.print(diagonal.trim());
    }
}
