/*Given the triangle of consecutive odd numbers:

        1
        3     5
        7     9    11
        13    15    17    19
        21    23    25    27    29 */

class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        // Calculate the first number in the nth row
        int firstNumber = 1;
        for (int i = 1; i < n; i++) {
            firstNumber += 2 * i;
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += firstNumber + 2 * i; // Add consecutive odd numbers
        }

        return sum;
    }
}
