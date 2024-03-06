import java.util.Random;

public class Dice {


    public int rollDice(){
        Random rand = new Random();
        int result1 = (rand.nextInt(6)) + 1;
            return result1;
        }
    }
