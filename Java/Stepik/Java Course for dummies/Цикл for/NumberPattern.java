import java.util.Scanner;
class MyProgram {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int  num = sc.nextInt();
      int count = 1;
        for (int i = 1; i <= num; i++){
            for (int z = 1; z <= count;z++){
                if (z == 1) System.out.print (z); 
else if (z > 1) System.out.print (" " + z); 
            }
         System.out.println("");
         count++;
        }
	}
}
