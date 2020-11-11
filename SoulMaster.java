package D_JavaAdvancedOOP.Lecture2_Inheritances.ExProblem3;
public class SoulMaster extends DarkWizard {
    public SoulMaster(String username, int level) {
        super(username, level);
    }

    @Override
    public String toString() {
        return "Type: SoulMaster" + super.toString();
    }

}