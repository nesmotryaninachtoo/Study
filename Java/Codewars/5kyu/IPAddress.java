//Complete the function that takes an unsigned 32 bit number and returns a string representation of its IPv4 address.

public class Kata {
    public static String longToIP(long ip) {
        String binary = Long.toBinaryString(ip);
        String result = "";
        StringBuilder sb = new StringBuilder(binary);
        while (sb.length() < 32) {
            sb.insert(0, '0');
        }
        sb.insert(8,".");
        sb.insert(17,".");
        sb.insert(26,".");
        String[] array = sb.toString().split("\\.");
        for (int i = 0;i < array.length;i++){
            result += String.valueOf(Integer.parseInt(array[i], 2)) + ".";
        }
        return result.substring(0,result.length() - 1); // do it!
    }
}
