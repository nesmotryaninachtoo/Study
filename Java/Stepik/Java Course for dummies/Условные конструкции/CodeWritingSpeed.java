import java.util.Scanner;

 class myProg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if (num1 > num2) {
			System.out.println("Махатма");
		} else {
			System.out.println("Джавахарлал");
		}
	}
}
