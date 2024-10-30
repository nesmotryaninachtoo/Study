import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
            for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = sc.nextInt();
            }
            for (int j = 0;j < numbers.length - 1; j++){
                if (numbers[j] < numbers [j + 1]){
                    System.out.print(numbers[j + 1] + " ");
                }
            }

        }
    }

