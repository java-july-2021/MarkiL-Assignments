package ZookeeperPart1;

public class Mammal {
    //attributes
    protected int energyLevel;

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
