import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = "";
        String[][] strings = new String[n][];
        for (int i = 0; i < n; ++i) {
            strings[i] = sc.nextLine().split(" ");
        }
        for (int j = 0;j < n;j++){
            System.out.println(Arrays.toString(strings[j]));
        }
    }
}
