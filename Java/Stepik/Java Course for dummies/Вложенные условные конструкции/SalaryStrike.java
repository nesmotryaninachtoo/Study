import java.util.Scanner;
class myClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int diff = sc.nextInt();
		if ((a - b) > diff || (a - c) > diff) {
			System.out.print("Ура, бастуем!");
		}
		else if ((b - a) > diff || (b - c) > diff ) {
			System.out.print("Ура, бастуем!");
		}
		else if ((c - a) > diff  || (c - b) > diff) {
			System.out.print("Ура, бастуем!");
		}
		else {
			System.out.print("За работу, Солнце ещё высоко");
		}
		
		
	
	
	
	
	
	
	}
}
