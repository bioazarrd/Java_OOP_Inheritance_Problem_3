package D_JavaAdvancedOOP.Lecture2_Inheritances.ExProblem3;

public class Gorilla extends Mammal {
    public Gorilla(String name) {
        super(name);
    }

    @Override
    public void feedAnimal() {
        System.out.println("Banana banana");
    }


}
