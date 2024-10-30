//Given an array of positive integers (the weights of the people), return a new array/tuple of two integers,
//where the first one is the total weight of team 1, and the second one is the total weight of team 2.

public class Solution
{
    public static int[] rowWeights (final int[] weights)
    {
        int team1 = 0;
        int team2 = 0;
        for (int i = 0;i < weights.length;i++){
            if (i % 2 != 0){
                team2 += weights[i];
            }
            else {
                team1 += weights[i];
            }
        }
        return new int[]{team1,team2};
    }
}
