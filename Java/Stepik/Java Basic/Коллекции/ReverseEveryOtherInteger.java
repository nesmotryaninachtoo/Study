import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int counter = 0;
        while (sc.hasNext()) {
            if (counter % 2 != 0) {
                list.add(sc.nextInt());
            } else {
                sc.nextInt();
            }
            counter++;
        }
        Collections.reverse(list);
        for (int i = 0;i < list.size();i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
