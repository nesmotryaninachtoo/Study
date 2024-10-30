import java.util.Scanner; 

class MySolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String asisstant = sc.nextLine();
        int email = sc.nextInt();
        System.out.println("Привет, " + username +", это твой помощник " + asisstant + ".");
        System.out.println("У тебя " + email + " новых писем.");
    }
}




