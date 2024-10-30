import java.util.Scanner;

class myClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		if (day < 1 || day > 31) {
			System.out.print(false);
		}
		else if (month < 1 || month > 12 || year < 0 ) {
			System.out.print(false);
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day > 30) {
				System.out.print(false);
			}
		}
		else if (month == 2) {
			if (isLeapYear) {
				if (day > 29) {
					System.out.print(false);
				}
				else {
					System.out.print(true);
				}
			}
			else {
					if (day > 28) {
						System.out.print(false);
					}
					else {
						System.out.print(true);
					}
				}
			}
		else {
			System.out.print(true);
		}
	}
}
