/**
 * Merges two given sorted arrays into one
 *
 * @param a1 first sorted array
 * @param a2 second sorted array
 * @return new array containing all elements from a1 and a2, sorted
 */

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] mergedArray = new int[a1.length + a2.length];
        int i = 0, j = 0, k = 0;
        while (i < a1.length && j < a2.length) {
            if (a1[i] < a2[j]) {
                mergedArray[k] = a1[i];
                i++;
            } else {
                mergedArray[k] = a2[j];
                j++;
            }
            k++;
        }
        while (i < a1.length) {
            mergedArray[k] = a1[i];
            i++;
            k++;
        }
        while (j < a2.length) {
            mergedArray[k] = a2[j];
            j++;
            k++;
        }
        return mergedArray;
    }
