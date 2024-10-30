import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int naturalNumber = 2;
        int i = 1;
        while (i <= number){
            System.out.print(i + " ");
            i = naturalNumber * naturalNumber;
            naturalNumber++; 
        }
    }
}
