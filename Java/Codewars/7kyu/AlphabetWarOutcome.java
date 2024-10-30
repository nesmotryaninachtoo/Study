/**
 * Introduction
 * There is a war and nobody knows - the alphabet war!
 * There are two groups of hostile letters. The tension between left side letters and right side letters was too high and the war began.
 * 
 * Task
 * Write a function that accepts a fight string consisting of only small letters and returns who wins the fight. 
 * When the left side wins, return "Left side wins!",
 * when the right side wins, return "Right side wins!",
 * otherwise, return "Let's fight again!".
 * 
 * The left side letters and their power:
 * w - 4
 * p - 3
 * b - 2
 * s - 1
 * 
 * The right side letters and their power:
 * m - 4
 * q - 3
 * d - 2
 * z - 1
 * 
 * The other letters don't have power and are only victims.
 */

public class Kata {
    public static String alphabetWar(String fight) {
        String[] leftSide = {"s", "b", "p", "w"};
        String[] rightSide = {"z", "d", "q", "m"};
        int leftSideScore = fighting(fight, leftSide);
        int rightSideScore = fighting(fight, rightSide);
        System.out.println(leftSideScore);
        System.out.println(rightSideScore);
        if (leftSideScore > rightSideScore) {
            return "Left side wins!";
        } else if (rightSideScore > leftSideScore) {
            return "Right side wins!";
        } else {
            return "Let's fight again!";
        }
    }

    public static int fighting(String fight, String[] side) {
        int score = 0;
        for (int j = 0; j < side.length; j++) {
            for (int i = 0; i < fight.length(); i++) {
                if (side[j].equals(String.valueOf(fight.charAt(i)))) {
                    score += j + 1;
                }
            }
        }

        return score;
    }
}
