package ObjectMasterP1;

public class HumanTest {
    public static void main(String[] args) {
        Human human1 = new Human(3, 3, 3, 100);
        Human human2 = new Human(3, 3, 3, 100);
        human1.attack(human2);
        System.out.println("Human 1 attacked Human 2");

        human1.attack(human2);
        System.out.println(human1.getHealth());
        System.out.println(human2.getHealth());
        human1.attack(human2);
        System.out.println(human1.getHealth());
        System.out.println(human2.getHealth());
        human2.attack(human1);
        System.out.println(human1.getHealth());
        System.out.println(human2.getHealth());
        
    }
}
