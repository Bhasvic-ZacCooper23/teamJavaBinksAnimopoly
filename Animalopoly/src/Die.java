import java.util.Random;

public class Die {
    public Random random = new Random();

    public int roll()
    {
        return random.nextInt(6)+1; // create random number between 1 and 6
    }
}