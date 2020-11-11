package D_JavaAdvancedOOP.Lecture2_Inheritances.ExProblem3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        Hero hero = new SoulMaster("Sauron", 99);
        System.out.println(hero.toString());

    }
}