import java.util.ArrayList;
import java.util.Scanner;

public class Board
{

    ArrayList<Spaces> spaces = new ArrayList<>();
    ArrayList<Players> players = new ArrayList<>();
    Cards cards = new Cards();
    Boolean won = false;
    public void intitialise()
    {
        for (int i = 0; i < 26; i++)
        {
            spaces.add(new Spaces(i));
        }
        System.out.println("How many players?");
        Scanner scanner = new Scanner(System.in);
        int lim = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < lim; i++)
        {
            players.add(new Players());
            System.out.println("What's player "+i+"'s name?");
            players.get(i).setName(scanner.nextLine());
            System.out.println("What's player "+i+"'s symbol?");
            players.get(i).setCharacter(scanner.nextLine());
        }
    }
    public void doATurn(int playerNum)
    {
        if(!players.get(playerNum).getSkippedTurn())
        {
            System.out.println("It's player " + playerNum + "'s turn!" + "\n type 'roll' to roll your dice!");
            Die dice1 = new Die();
            int roll1 = dice1.roll();
            int roll2 = dice1.roll();
            if (roll1 == roll2) {
                System.out.println("You rolled a " + (roll1 + roll2) + "!\nand it was a double!");
                System.out.println(cards.getCard(1));
            } else {
                System.out.println("You rolled a " + (roll1 + roll2));
            }
            players.get(playerNum).setPosition(players.get(playerNum).getPosition() + roll1 + roll2);
            if(players.get(playerNum).getPosition()>26)
            {
                players.get(playerNum).setPosition(players.get(playerNum).getPosition()-26);
            }
            System.out.println(spaces.get(players.get(playerNum).getPosition()).getName()+"\n"+spaces.get(players.get(playerNum).getPosition()).getInfo());
        }
        else
        {
            System.out.println("Your turn has been skipped");
            players.get(playerNum).setSkippedTurn(false);
        }
    }
}
