package ObjectMasterP2;

public class Wizard extends Human {
    public Wizard() {
        super(3, 3, 50, 8); //values of attributes
    }
    
    //method to heal human by adding value of wizard's intelligence to human's health
    public void heal(Human target) {
        health = 0;
        target.health += getIntelligence();   //also tried wizard.getIntelligence() & getIntelligence(wizard); neither are correct     
        System.out.println("Wizard has healed human");
    }

    //method to throw fireball at human, decreasing human's health by value of wizard's intelligence
    public void fireball(Human target) {
        health = 0;
        target.health -= getIntelligence() * 3;
        System.out.println("Wizard has hurled a fireball at human");
    }
}
