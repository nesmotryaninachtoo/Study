/*Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each.
If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love. */

public class OppositesAttract {

    public static boolean isLove(final int flower1, final int flower2) {
        if (((flower1 % 2 == 0) && (flower2 % 2 != 0)) || ((flower1 % 2 != 0) && (flower2 % 2 == 0))) {
            return true;
        }
        return false;
    }

}
