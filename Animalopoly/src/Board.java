import java.util.ArrayList;
import java.util.Scanner;

public class Board {
    // initialise all object arrays
    ArrayList<Spaces> spaces = new ArrayList<>();
    ArrayList<Players> players = new ArrayList<>();
    Cards cards = new Cards();
    // initialise the won bool
    Boolean won = false;
    // initialises the scanner, always useful
    Scanner scanner = new Scanner(System.in);

    public void intitialise()
    {
        // add 26 spaces
        for (int i = 0; i < 26; i++) {
            spaces.add(new Spaces(i));
        }
        System.out.println("How many players?");
        int lim = Integer.parseInt(scanner.nextLine());

        // create a player class per player asked for
        for (int i = 0; i < lim; i++) {
            // add them to array
            players.add(new Players());
            System.out.println("What's player " + (i+1) + "'s name?");
            // set their name
            players.get(i).setName(scanner.nextLine());
            System.out.println("What's player " + (i+1) + "'s symbol?");
            // and their character
            players.get(i).setCharacter(scanner.nextLine().charAt(0));
        }
        System.out.println("Done initialising, lets play!");
    }

    public void doATurn(int playerNum)
    {
        // assign player to the current player's object
        Players player = players.get(playerNum);
        // check they haven't lost
        if(!player.getLost())
        {
            // check if their turn has been skipped
            if (!player.getSkippedTurn())
            {
                System.out.println("It's " + player.getName() + "'s turn!" + "\nYou have £"+player.getMoney()+"\n type 'roll' to roll your dice!");
                Die dice = new Die();
                //create and roll the dice
                int roll1 = dice.roll();
                int roll2 = dice.roll();
                // check for a double
                if (roll1 == roll2) {
                    System.out.println("You rolled a " + (roll1 + roll2) + "!\nand it was a double!");
                    // get a card
                    System.out.println(cards.getCard(1));
                } else {
                    System.out.println("You rolled a " + (roll1 + roll2));
                }
                // move player what they rolled spaces
                player.setPosition(player.getPosition() + roll1 + roll2);
                // if they go past 26 move them back
                if (player.getPosition() > 26) {
                    player.setPosition(player.getPosition() - 26);
                }
                // assign space to the current space's object
                Spaces space = spaces.get(player.getPosition());
                // print out that spaces name and information
                System.out.println(space.getName() + "\n" + space.getInfo());
                // check if that space has been bought
                if (space.getUpgradeLevel() == 0) {
                    System.out.println("This space has not been bought. It costs: " + space.getUpgradePrice() + " \n Would you like to buy it?(Y/N)");
                    //if they want to buy it
                    if (scanner.nextLine().equals("Y")) {
                        if (player.getMoney() >= space.getUpgradePrice()) {
                            //take their money for the purchase
                            player.setMoney(player.getMoney() - space.getUpgradePrice());
                            space.setUpgradeLevel(1);
                            space.setOwner(playerNum);
                            //display the rent of the space
                            System.out.println("This exhibit will cost " + space.getRent() + " to view");
                        } else {
                            System.out.println("Sorry you don't have enough money!");
                        }
                    }
                }
            } else {
                // if they've been skipped let them know and unskip them
                System.out.println("Player " + playerNum + ", your turn has been skipped");
                player.setSkippedTurn(false);
            }
        }
    }
}
