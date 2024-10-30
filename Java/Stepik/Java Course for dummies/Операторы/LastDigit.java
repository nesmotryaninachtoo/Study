import java.util.Scanner; 

class MyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int myVar = Math.abs(x % 10);
        System.out.print(myVar);
   }
}
