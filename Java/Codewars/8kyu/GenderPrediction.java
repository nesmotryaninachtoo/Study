/*If the sperm contains the X chromosome, return "Congratulations!
You're going to have a daughter."; 
If the sperm contains the Y chromosome, return "Congratulations! You're going to have a son." */

public class Kata {
  public static String chromosomeCheck(String sperm) {
    if (sperm.equals("XY")){
      return "Congratulations! You're going to have a son.";
    }
    return "Congratulations! You're going to have a daughter.";
  }
}
