
import java.util.Random;

public class Medicat extends Feline {
    String girl = "female";
    String boy = "male";

    int speedRange = new Integer();
    int number;


    Feline f = new Feline();

    f.walk();

    Medicat m = new Medicat();

    m.run();

    speedRange.nextInt();


    public static void jump() {
        System.out.println("How high can the female cat jump?");

    }

    public static void stretch() {
        System.out.println("What kind of stretching does your cat do?");
    }

    public static void speedRange() {

        Random random = new Random();
        int integer = random.nextInt();


        for (int i = 0; i <=45;i ++)

        System.out.println();
    }

    }



}
