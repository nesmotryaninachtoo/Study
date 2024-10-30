import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int secondsInput = sc.nextInt();
    int hours = secondsInput % 86400 / 3600;
    int minutes = secondsInput % 3600 / 60 ;
    int seconds = secondsInput % (3600 / 60);
    System.out.format("%02d" + ":" + "%02d" + ":" + "%02d", hours, minutes, seconds);

    }
}
