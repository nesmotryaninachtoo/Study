import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        switch (input) {
            case "System.out.println()" :
                System.out.print("Это команда вывода на печать");
                break;
            case "if" :
                System.out.print("Это условный оператор");
                break;
            case "else" :
                System.out.print("Это альтернативная конструкция условного оператора ");
                break; 
            default :
        System.out.print("Раздел в разработке");
    }
}
}
