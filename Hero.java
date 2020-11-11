package D_JavaAdvancedOOP.Lecture2_Inheritances.ExProblem3;

public class Hero {

    private String username;
    private int level;

    public  Hero(String username, int level) {
        this.username = username;
        this.level = level;
    }


    @Override
    public String toString() {
        return String.format("Type: %s Username: %s Level: %s",
                this.getClass().getSimpleName(),
                this.username,
                this.level);

    }


}
