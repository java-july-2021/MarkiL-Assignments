package ZookeeperTwo;

public class Bat extends Mammal {

    public Bat(int energyLevel) {
        super(energyLevel); 
    }

    //in the online solution, the initial energy level of 300 was added here
    //it was set up like this:
    //public Bat() {
    //    super(300);
    //}

    public void fly() {
        System.out.println("Wings flap flap whoosh");
        this.energyLevel -= 50;
    }

    public void eatHumans() {
        System.out.println("Bat has consumed its meal");
        this.energyLevel =+ 25;
    }

    public void attackTown() {
        System.out.println("Crackle of flames as they rise through the air and spread through the town");
        this.energyLevel -= 100;
    }
}
