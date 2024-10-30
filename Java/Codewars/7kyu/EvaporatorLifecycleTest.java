/*This program tests the life of an evaporator containing a gas.

We know the content of the evaporator (content in ml),
the percentage of foam or gas lost every day (evap_per_day)
and the threshold (threshold) in percentage beyond which the evaporator is no longer useful.
All numbers are strictly positive.
The program reports the nth day (as an integer) on which the evaporator will be out of use. */

public class Evaporator {
    public static int evaporator(double content, double evap_per_day, double threshold) {
        int days = 0;
        double originalContent = content;
        while (content > originalContent / 100 * threshold){
            content -= content / 100 * evap_per_day;
            days++;
        }
        return days;
    }
}
