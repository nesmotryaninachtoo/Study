import java.util.Scanner; 

class MySolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.nextLine();
        String month = sc.nextLine();
        String day = sc.nextLine();
        System.out.println(day + ":" + month + ":" + year);     
    }
}
