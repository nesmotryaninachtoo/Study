/*Write a simple parser that will parse and run Deadfish.

Deadfish has 4 commands, each 1 character long:
    ·i increments the value (initially 0)
    ·d decrements the value
    ·s squares the value
    ·o outputs the value into the return array
Invalid characters should be ignored. */

public class DeadFish {
    public static int[] parse(String data) {
    	int value = 0;
    	int finalArrayLength = 0;
        int [] finalArray = new int [finalArrayLength];
        char[] array = data.toCharArray();
        for (int i = 0;i < array.length;i++) {
        	if (String.valueOf(array[i]).equals("i")) {
        		value++;
        	}
        	else if (String.valueOf(array[i]).equals("d")) {
        		value--;
        	}
        	else if (String.valueOf(array[i]).equals("s")) {
        		value = value * value;
        	}
        	else if (String.valueOf(array[i]).equals("o")) {
        		finalArrayLength++;
        		int[] newArray = new int[finalArrayLength];
        		System.arraycopy(finalArray, 0, newArray, 0, finalArray.length);
        		newArray[finalArrayLength - 1] = value;
        		finalArray = newArray;
        	}
        }
        return finalArray;
    }
}
