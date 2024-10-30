import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 1; i <= numbers.length; i++) {
            numbers[i - 1] = i;
            System.out.print(numbers[i-1] + " ");
        }   
    }
}
