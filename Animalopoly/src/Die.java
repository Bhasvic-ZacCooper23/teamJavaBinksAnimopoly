import java.util.Random;

public class Die {
    public Random random = new Random();

    public int roll() {
        return random.nextInt(8)-1; // create random number between 0 and 6

    }
}
