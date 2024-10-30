import java.util.Scanner;
class MyProgram {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        for(int k = 1; k <=x; k++){
        int y = 0;
        for(int i=1; i <=x; i++){
         for(int j=1; j <=i; j++)   {
          if (y != k){
          y++;
              if (i ==1){
                   System.out.print(i);
              }
              else{
              System.out.print(" " + i);
              }
          }
             else{
                 break;   
             }
         }
        }
            System.out.println();
    }
}
}
