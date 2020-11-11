package D_JavaAdvancedOOP.Lecture2_Inheritances.ExProblem3;
public class DarkWizard extends Wizard{



    public DarkWizard(String username, int level) {
        super(username, level);
    }

    @Override
    public String toString() {
        return "Type: DarkWizard" + super.toString();
    }
}
