import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 1;
        while (sc.hasNextLine()){
            sc.nextLine();
            count++;
        }
        System.out.println("Строк: " + count);
        System.out.println("Столбцов: " + str.replace(" ", "").length());

    }
}
