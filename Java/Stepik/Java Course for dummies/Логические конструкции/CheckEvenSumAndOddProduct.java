import java.util.Scanner;

class myClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		boolean a = (num1 + num2) % 2 == 0 && (num1 * num2) % 2 !=0;
		System.out.println(a);
	}
}

