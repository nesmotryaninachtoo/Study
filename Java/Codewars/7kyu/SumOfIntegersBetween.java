//Given two integers a and b, which can be positive or negative, find the sum of all the integers between and including them and return it. If the two numbers are equal return a or b.

public class Sum {
    public int GetSum(int a, int b) {
        if (a == b) {
            return a;
        } else if (a < b) {
            int sum = 0;
            int i = a;
            do {
                sum += i;
                i++;
            } while (i <= b);
            return sum;
        } else {
            int sum = 0;
            int i = b;
            do {
                sum += i;
                i++;
            } while (i <= a);
            return sum;
        }
    }
}

