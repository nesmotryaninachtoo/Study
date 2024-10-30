import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] numbers = new int[n][m];
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                numbers[i][j] = (i + 1) * (j + 1);
                if (j != m - 1){
                    System.out.print((numbers[i][j] + " "));
                }
                else {
                    System.out.print((numbers[i][j]));
                }
            }
            System.out.print("\n");
        }
    }
}
