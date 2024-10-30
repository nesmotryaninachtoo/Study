import java.util.Scanner; 

class MyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = 5 *(Math.pow(x,2)) + 2 * x +11;
        System.out.println(y);

   }
}
