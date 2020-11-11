package D_JavaAdvancedOOP.Lecture2_Inheritances.ExProblem3;

public class Lizard extends Reptile {

    public Lizard(String name) {
        super(name);
    }

    @Override
    public void feedAnimal() {
        System.out.println("Mana plus plus");
    }
}
