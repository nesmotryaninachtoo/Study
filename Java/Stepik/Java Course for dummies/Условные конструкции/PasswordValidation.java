import java.util.Scanner;

    class myClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		if (str1.equals(str2)) {
			System.out.println("Access is granted");
		} else {
			System.out.println("Access is denied");
		}
	}
}
