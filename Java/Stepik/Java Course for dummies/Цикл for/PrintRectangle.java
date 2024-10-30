import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int i = 0; i < x; i++){
            for (int z = 0;z < y; z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
