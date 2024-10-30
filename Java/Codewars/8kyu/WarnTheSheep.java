/*Wolves have been reintroduced to Great Britain. 
You are a sheep farmer, and are now plagued by wolves which pretend to be sheep.
Fortunately, you are good at spotting them.
Warn the sheep in front of the wolf that it is about to be eaten. 
Remember that you are standing at the front of the queue which is at the end of the array
Note: there will always be exactly one wolf in the array. */

public class ZywOo {

    public static String warnTheSheep(String[] array) {
        int counter = 0;
        for (int i = 0;i < array.length;i++){
            if (array[i].equals("wolf")){
                counter = i;
            }
        }
        if (counter == array.length - 1){
            return "Pls go away and stop eating my sheep";
        }
        else {
            return "Oi! Sheep number " + (array.length - counter - 1) + "! You are about to be eaten by a wolf!";
        }
    }

}
