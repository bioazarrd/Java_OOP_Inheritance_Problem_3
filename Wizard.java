package D_JavaAdvancedOOP.Lecture2_Inheritances.ExProblem3;
public class Wizard extends Hero {

    public Wizard(String username, int level) {
        super(username, level);
    }


    @Override
    public String toString() {
        return "Type: Wizard" + super.toString();
    }
}