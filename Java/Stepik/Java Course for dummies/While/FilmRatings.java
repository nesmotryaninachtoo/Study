import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (sc.hasNext()) {
            int rating = sc.nextInt();
            if (rating > 10 || rating < 0){
                break;
            }
            count++;
            sum += rating;
        }
        System.out.println((double) sum / count);
    }
}
