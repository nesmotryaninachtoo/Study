import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuilder stringConversion = new StringBuilder();
        for (int i = 1;i <= num; i++){
            for (int z = 0; z < i; z++){
                stringConversion.append(i);
            }
        }
        String output = (stringConversion.substring(0 ,num));
        output = output.replace("", " ").trim();
        System.out.println(output);
    }
}
