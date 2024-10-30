import java.util.Scanner;

class myClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word1 = sc.next();
		String word2 = sc.next();
		String word3 = sc.next();
		String max = word1;
		String mid = word1;
		String min = word1;
		if (max.charAt(0) < word2.charAt(0)) {
			max = word2;
		}
		if (max.charAt(0) < word3.charAt(0)) {
			max = word3; 
		}
		if (min.charAt(0) > word2.charAt(0)) {
			min = word2;
		}
		if (min.charAt(0) > word3.charAt(0)) {
			min = word3;
		}
		if (max.equals(word2) && min.equals(word3) || max.equals(word3) && min.equals(word2)) {
			mid = word1;
		}
		else if (max.equals(word1) && min.equals(word3) || max.equals(word3) && min.equals(word1)) {
			mid = word2;
		}
		else if (max.equals(word1) && min.equals(word2) || max.equals(word2) && min.equals(word1)) {
			mid = word3;
		}
		System.out.println(min);
		System.out.println(mid);
		System.out.println(max);
	
	}
}
