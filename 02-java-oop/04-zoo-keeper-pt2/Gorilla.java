package ZookeeperTwo;

public class Gorilla extends Mammal {

    public Gorilla(int energyLevel) {
        super(energyLevel);
    }
    public void throwsomething() {
        System.out.println("Gorilla has thrown an artefact");
        this.energyLevel -= 5;
    }

    public void eatBananas() {
        System.out.println("Gorilla has eaten a banana");
        this.energyLevel =+ 10;
    }

    public void climb() {
        System.out.println("Gorilla has climbed a tree");
        this.energyLevel -= 10;
    }
}
