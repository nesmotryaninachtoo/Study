import java.util.Scanner;

class MyProg {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		System.out.println((num1 < num2) ? "Бой продолжается!" : "Холифилд - чемпион!");
	}
}
