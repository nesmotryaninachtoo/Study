import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n + 1];
        int sum = 0;
            for (int i = 0; i < numbers.length; i+= 2) {
                    numbers[i] = i;
            }
            for (int j = 0; j < numbers.length;j++){
                if (numbers[j] != 0){
                    System.out.print(" " + numbers[j]);
                    sum += numbers[j];
                }
            }
            System.out.println("\n" + sum);
        }
    }

