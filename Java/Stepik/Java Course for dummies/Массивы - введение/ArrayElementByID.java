import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = sc.nextInt();
            }
            int id = sc.nextInt();
            System.out.print(numbers[id]);
        }
}
