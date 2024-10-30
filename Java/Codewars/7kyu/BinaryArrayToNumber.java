//Given an array of ones and zeroes, convert the equivalent binary value to an integer.

import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        String str = "";
        for (int i = 0;i < binary.size();i++){
            str += binary.get(i);
        }
        return Integer.parseInt(str ,2);
    }
}
