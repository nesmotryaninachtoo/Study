import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.nextLine();
        String [] array = sc.nextLine().split(" ");
        if (n < 0 || n > array.length - 1){
            System.out.print("Неверный ввод");
        }
        else {
            System.out.print(array[n]);
        }
    }
}
