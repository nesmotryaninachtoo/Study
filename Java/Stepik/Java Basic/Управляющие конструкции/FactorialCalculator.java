/**
 * Calculates factorial of given <code>value</code>.
 *
 * @param value positive number
 * @return factorial of <code>value</code>
 */

public static BigInteger factorial(int value) {
    BigInteger total = BigInteger.valueOf(1);
    for (int i = 1; i <= value;i++){
        total = total.multiply(BigInteger.valueOf(i));
    }
    return total;
}
