package ObjectMasterP2;

public class Ninja extends Human {
    public Ninja() {
        super(3, 10, 3, 3); //values of attributes
    }

    //method to remove amount of ninja's stealth from human, then add that value to the ninja
    public void steal(Human target) {
        //stealth = 0; //necessary?
        //health = 0;
        target.health -= getStealth();
        this.health += getHealth();
        System.out.println("Ninja has stolen human's health and become stronger");
    }

    //method to remove health from ninja that runs away
    public void runAway() {
        this.health -= 10;
        System.out.println("Ninja has run away");
    }
}
