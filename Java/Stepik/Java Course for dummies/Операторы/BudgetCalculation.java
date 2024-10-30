import java.util.Scanner; 

class MyNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int budget = sc.nextInt();
    int salary = sc.nextInt();
    int developersAmount = budget / salary;
    int moneyLeft = budget % salary;
    System.out.println(developersAmount + " " + moneyLeft);
   }
}
