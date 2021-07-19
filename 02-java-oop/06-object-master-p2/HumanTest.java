package ObjectMasterP2;

public class HumanTest {
    public static void main(String[] args) {
        Human human1 = new Human(3, 3, 3, 100);
        Human human2 = new Human(3, 3, 3, 100);
        human1.attack(human2);
        System.out.println("Human 1 attacked Human 2");

        human1.attack(human2);
        System.out.println(human1.getHealth());
        System.out.println(human2.getHealth());

        Wizard Merin = new Wizard();
        Wizard Angleiro = new Wizard();
        Ninja Tchai = new Ninja();
        Ninja Gingibre = new Ninja();
        Samarai Uno = new Samarai();
        Samarai Mocha = new Samarai();
        Samarai Halley = new Samarai();
        Samarai Otie = new Samarai();

        Merin.fireball(human1);
        System.out.println(human1.getHealth());

        Angleiro.heal(human1);
        System.out.println(human1.getHealth());

        Tchai.steal(human2);
        System.out.println(human2.getHealth());
        System.out.println(Tchai.getHealth());

        Gingibre.runAway();
        System.out.println(Gingibre.getHealth());

        Uno.deathBlow(human2);
        System.out.println(human2.getHealth());
        System.out.println(Uno.getHealth());

        Mocha.meditate();
        System.out.println(Mocha.getHealth());

        Halley.meditate();
        System.out.println(Halley.getHealth());

        Otie.meditate();
        System.out.println(Otie.getHealth());

        //not sure how to print how many
        
        
    }
}
