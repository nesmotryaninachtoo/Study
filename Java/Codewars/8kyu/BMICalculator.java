public class Calculate {
  public static String bmi(double weight, double height) {
    double bmi = (weight / Math.pow(height,2));
    String decision = "";
    if (bmi <= 18.5){
      decision = "Underweight";
    }
    else if (bmi <= 25){
      decision = "Normal";
    }
    else if (bmi <= 30){
      decision = "Overweight";
    }
    else if (bmi > 30){
      decision = "Obese";
    }
    return decision;
  }
}
