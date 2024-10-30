/*Given two Arrays in which values are the power of each soldier, return true if you survive the attack or false if you perish.
CONDITIONS:
    Each soldier attacks the opposing soldier in the same index of the array. The survivor is the number with the highest value.
        1)If the value is the same they both perish
        2)If one of the values is empty(different array lengths) the non-empty value soldier survives.
    To survive the defending side must have more survivors than the attacking side.
    In case there are the same number of survivors in both sides, the winner is the team with the highest initial attack power.
    If the total attack power of both sides is the same return true.
    The initial attack power is the sum of all the values in each array. */

public class Kumite{
    public static boolean block(int[] attackers, int[] defenders){
        int power1 = 0;
        int survivors1 = 0;
        int power2 = 0;
        int survivors2 = 0;
        for (int attacker : attackers) {
            power1 += attacker;
        }
        for (int defender : defenders) {
            power2 += defender;
        }
        for (int z = 0;z < Math.min(attackers.length,defenders.length);z++){
            if (attackers[z] > defenders[z]){
                survivors1++;
            }
            else if (defenders[z] > attackers[z]) {
                survivors2++;
            }
        }
        if (attackers.length > defenders.length){
            survivors1 += attackers.length - defenders.length;
        }
        if (defenders.length > attackers.length){
            survivors2 += defenders.length - attackers.length;
        }
        if (survivors1 > survivors2){
            return false;
        } else if (survivors1 == survivors2) {
            return power1 <= power2;
        } else {
            return true;
        }
    }
}
