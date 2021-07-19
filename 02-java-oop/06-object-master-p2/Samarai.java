package ObjectMasterP2;

public class Samarai extends Human {
    public Samarai() {
        super(3, 3, 3, 200); //values of attributes
    }

    //method to deal deathblow to human
    public void deathBlow(Human target) {
        target.health = 0;
        this.health = getHealth()/2;
        System.out.println("Samarai has dealt a deathblow at great cost");
    }

    //method to heal samarai through meditation
    public void meditate() {
        this.health += getHealth()/2;
        System.out.println("Samarai heals through meditation");
    }

    //method to count the number of samarais
    public static int howMany(int count) {
        count = 0;
        count++;
        return count;
    }

}
