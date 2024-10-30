import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        int i = 0;
        while (sc.hasNextLine()) {
            str += sc.nextLine() + "///";
            i++;
        }
        String[] array = str.split("///");
        String[][] array2 = new String[i][];
        for (int j = 0; j < i;j++){
            array2[j] = array[j].split(" ");
        }
        for (int j = 0; j < array2[i-1].length; j++) {
            for (int k = array2.length - 1; k >= 0; k--) {
                if (k != 0)
                    System.out.print (array2[k][j] + " ");
                else
                    System.out.println (array2[k][j]);
            }
        }
    }
}
