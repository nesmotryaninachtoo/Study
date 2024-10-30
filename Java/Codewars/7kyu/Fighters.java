//IN PROGRESS

public class Main {
    public static void main(String[]args){
        Kata.declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Lew");
    }
}
class Fighter {
    public String name;
    public int health, damagePerAttack;
    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;

    }
}

class Kata {
    public static void declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        if (firstAttacker.equals(fighter1.name)) {
            while (fighter1.health > 0 || fighter2.health > 0) {
                if (fighter1.health - fighter2.damagePerAttack < 0){
                    System.out.println(fighter2.name + " attacks " + fighter1.name + ": " + fighter1.name + " now has " + (fighter1.health - fighter2.damagePerAttack) + " and is dead. " + fighter2.name + " wins");
                    break;
                } else {
                    if (fighter2.health - fighter1.damagePerAttack < 0){
                        System.out.println(fighter1.name + " attacks" + fighter2.name + ": " + fighter2.name + " now has " + (fighter2.health - fighter1.damagePerAttack) + " and is dead. " + fighter1.name + "wins");
                        break;
                    }
                }
                fighter2.health -= fighter1.damagePerAttack;
                System.out.println(fighter1.name + "attacks" + fighter2.name + "; " + fighter2.name + " now has " + fighter2.health);
                fighter1.health -= fighter2.damagePerAttack;
                System.out.println(fighter2.name + "attacks" + fighter1.name + "; " + fighter1.name + " now has " + fighter1.health);
            }

        }
        else {
            while (fighter1.health > 0 || fighter2.health > 0) {
                if (fighter1.health - fighter2.damagePerAttack < 0){
                    System.out.println(fighter2.name + "attacks" + fighter1.name + ": " + fighter1.name + " now has " + (fighter1.health - fighter2.damagePerAttack) + " and is dead. " + fighter2.name + "wins");
                    break;
                } else {
                    if (fighter2.health - fighter1.damagePerAttack < 0){
                        System.out.println(fighter1.name + "attacks" + fighter2.name + ": " + fighter2.name + " now has " + (fighter2.health - fighter1.damagePerAttack) + " and is dead. " + fighter1.name + "wins");
                        break;
                    }
                }
                fighter1.health -= fighter2.damagePerAttack;
                System.out.println(fighter2.name + "attacks" + fighter1.name + "; " + fighter1.name + " now has " + fighter1.health);
                fighter2.health -= fighter1.damagePerAttack;
                System.out.println(fighter1.name + "attacks" + fighter2.name + "; " + fighter2.name + " now has " + fighter2.health);
            }
        }
    }
}
