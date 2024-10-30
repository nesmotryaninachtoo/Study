import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] array = str.split(",");
        for (int i = 0; i < array.length;i++){
            System.out.println(array[i]);
        }

        }
    }

