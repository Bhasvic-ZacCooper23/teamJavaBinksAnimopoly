import java.util.Random;

    public class Dice {
        public static void main(String[] strg)
        {
            rollDice();
        }
        public static int rollDice()
        {
            Random random = new Random();
            int num1 = random.nextInt();
            int num2 = random.nextInt();
            int diceValue = num1+num2;
            return diceValue;
        }
    }

