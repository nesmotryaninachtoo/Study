// There is an array with some numbers. All numbers are equal except for one. Try to find it!

public class Kata {
    public static double findUniq(double arr[]) {
        double temp = 0;
        for (int i = 0; i < arr.length - 2;i++){
            temp = arr[i];
            if (temp != arr[i + 1] && temp == arr[i + 2]){
                return arr[i + 1];
                
            } else if (temp == arr[i + 1] && temp != arr[i + 2]){
                return arr[i + 2];
                
            } else if (temp != arr[i + 1] && temp != arr[i + 2]) {
                return temp;
            }
        }
        return arr[0];
    }
}
