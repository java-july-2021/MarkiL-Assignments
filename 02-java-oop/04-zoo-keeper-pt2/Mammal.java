package ZookeeperTwo;

public class Mammal {
    //attributes
    protected int energyLevel;
    //is it necessary to add a canFly boolean here? or is making a method enough?

    //constructor
    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    //method
    public int displayEnergy() {
        System.out.println("This mammal's energy level is: " + this.energyLevel);
        return this.energyLevel;
    }
}
