import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean condition = false;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i % 3 == 0){
                System.out.print(i + " ");
                condition = true;
            }
        }
        if (!condition){
            System.out.print("Таких чисел нет");
        }
    }
}
