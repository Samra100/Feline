import java.util.Random;

public class Bigcat extends Feline {
    int weight = 0;
    int height = 0;
    int n1 = 0;


    public static boolean loud() {
        return true;

    }

    public static boolean quiet() {
        return false;

        }

        public static void random() {

        Random rnd = new Random();
        int n1 = rnd.nextInt();

            System.out.println(rnd.nextInt(n1));
        }
    }

