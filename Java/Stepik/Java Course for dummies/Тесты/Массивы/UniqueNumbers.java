import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String [] array = sc.nextLine().split(" ");
        for (int i = 0; i < array.length;i++){
            for (int j = 0; j < array.length;j++){
                if (Objects.equals(array[i], array[j])){
                    count++;
                }
            }
            if (count == 1){
                System.out.print(array[i] + " ");
            }
            count = 0;
        }
    }
}
