import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length;i++){
            array[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Arrays.sort(array);
        if (k > 0 && k <= array.length) {
            System.out.print(array[k - 1]);
        }
        else {
            System.out.print("Ошибка ввода");
        }
    }
}

