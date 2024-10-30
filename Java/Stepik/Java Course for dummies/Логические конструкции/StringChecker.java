
import java.util.Scanner;

class myClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		if (str1.length() > 20 || str1.contains(str2)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
				
			}
	}
	}

