import java.util.Scanner;

class myClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if(((num1 % 2 == 0 && num2 % 2 == 0 ) && num3 % 2 != 0) || 
				((num2 % 2 == 0 && num3 % 2 == 0) && num1 % 2 != 0) || 
				(((num3 % 2 == 0 && num1 % 2 == 0) && num2 % 2 != 0))) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}

