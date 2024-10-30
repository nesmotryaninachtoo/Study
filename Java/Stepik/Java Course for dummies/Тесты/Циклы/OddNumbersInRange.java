import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int max = Math.max(num1,num2);
        int min = Math.min(num1,num2);
            for (int i = min;i <= max;i++){
                if (i % 2 !=0){
                    System.out.print(i + " ");
                }
            }
        }
    }
