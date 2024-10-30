import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.contains("Безос") || str.contains("Маск") || str.contains("Цукерберг") || str.contains("Гейтс")){
            System.out.println("Добро пожаловать!");
        }
        else {
            System.out.println("Здесь никого нет, Вы ошиблись дверью");
        }


    }
}
