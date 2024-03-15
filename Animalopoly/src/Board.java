import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
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
    // initialise the ui
    BoardUi ui = new BoardUi();

    public void intitialise()
    {
        // add 26 spaces
        for (int i = 0; i < 26; i++) {
            spaces.add(new Spaces(i));
        }
        Boolean valid = false;
        System.out.println("How many players?");
        int lim = Integer.parseInt(scanner.nextLine());
        if(lim<4 && lim>1)
        {
            valid = true;
        }
        while(!valid)
        {
            System.out.println("How many players?");
            lim = Integer.parseInt(scanner.nextLine());
            if(lim<4 && lim>1)
            {
                valid = true;
            }
        }

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
            // set their initial money & position at go
            players.get(i).setMoney(1500);
            players.get(i).setPosition(0);
        }
        System.out.println("Done initialising, lets play!");
    }
    public Boolean go;
    public int choice;
    public void doATurn(int playerNum) throws InterruptedException {
        // assign player to the current player's object
        Players player = players.get(playerNum);
        // check they haven't lost
        if(!player.getLost())
        {
            // check if their turn has been skipped
            if (!player.getSkippedTurn())
            {
                System.out.println("It's " + player.getName() + "'s turn!" + "\nYou have £"+player.getMoney()+"\n press enter to roll your dice!");
                ui.dialogueBox.setText("It's " + player.getName() + "'s turn!" + "\nYou have £"+player.getMoney()+"\n click the button to roll your dice!");
                ui.button1.setText("roll");
                go = false;
                ui.button1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        go = true;
                    }

                });
                while (!go)
                {
                    System.out.println("");
                }
                ui.button1.setText("");
                Die dice = new Die();
                //create and roll the dice
                int roll1 = dice.roll();
                int roll2 = dice.roll();
                // check for a double
                if (roll1 == roll2) {
                    System.out.println("You rolled a " + (roll1 + roll2) + "!\nand it was a double!");
                    ui.dialogueBox.setText("You rolled a " + (roll1 + roll2) + "!\nand it was a double!");
                    // get a card
                    Random random = new Random();
                    int cardNum = random.nextInt(21);
                    System.out.println(cards.getCard(cardNum));
                    ui.dialogueBox.setText(cards.getCard(cardNum));
                    //performs card's action
                    switch (cardNum)
                    {
                        case (0):
                        {
                            player.setMoney(player.getMoney()+100);
                        }
                        case (1):
                        {
                            player.setMoney(player.getMoney()-200);
                        }
                        case (2):
                        {
                            player.setSkippedTurn(true);
                        }
                        default:
                        {

                        }
                    }
                } else {
                    System.out.println("You rolled a " + (roll1 + roll2));
                    ui.dialogueBox.setText("You rolled a " + (roll1 + roll2));
                }
                // store new variable for future position
                int position = player.getPosition()+roll1+roll2;
                // if they go past 26 move them back
                if (position > 26)
                {
                    player.setPosition(position - 26);
                    System.out.println("You passed go! Collect 500");
                    ui.dialogueBox.setText("You passed go! Collect 500");
                    player.setMoney(player.getMoney()+500);
                }
                else if(position == 26)
                {
                    player.setPosition(position - 26);
                    System.out.println("You landed on go! Collect 1000");
                    ui.dialogueBox.setText("You landed on go! Collect 1000");
                    player.setMoney(player.getMoney()+1000);

                }
                else
                {
                    //otherwise move them ahead
                    player.setPosition(position);
                }
                // assign space to the current space's object
                Spaces space = spaces.get(player.getPosition());
                // print out that spaces name and information
                System.out.println(space.getName() + "\n" + space.getInfo());
                ui.dialogueBox.setText(space.getName() + "\n" + space.getInfo());
                // check if that space has been bought
                if (space.getUpgradeLevel() == 0) {
                    System.out.println("This space has not been bought. It costs: " + space.getUpgradePrice() + " \n Would you like to buy it?(Y/N)");
                    ui.dialogueBox.setText("This space has not been bought. It costs: " + space.getUpgradePrice() + " \n Would you like to buy it?");
                    //if they want to buy it
                    go = false;
                    choice = 0;
                    ui.button1.setText("Yes");
                    ui.button2.setText("No");
                    ui.button2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            choice = 1;
                        }
                    });
                    while(!go && choice == 0)
                    {
                        System.out.println("");
                    }
                    ui.button1.setText("End Go?");
                    ui.button2.setText("");
                    if (choice == 0) {
                        if (player.getMoney() >= space.getUpgradePrice()) {
                            //take their money for the purchase
                            player.setMoney(player.getMoney() - space.getUpgradePrice());
                            space.setUpgradeLevel(1);
                            space.setOwner(playerNum);
                            //display the rent of the space
                            System.out.println("This exhibit will cost " + space.getRent() + " to view");
                            ui.dialogueBox.setText("This exhibit will cost " + space.getRent() + " to view");
                        } else {
                            //tell them they don't have enough
                            System.out.println("Sorry you don't have enough money!");
                            ui.dialogueBox.setText("Sorry you don't have enough money!");
                        }
                    }
                    //if they own it
                } else if (space.getOwner()==playerNum)
                {
                    //ask if they want to upgrade
                    System.out.println("You own this space, would you like to upgrade it?\n It costs £"+space.getUpgradePrice()+" to upgrade.");
                    ui.dialogueBox.setText("You own this space, would you like to upgrade it?\n It costs £"+space.getUpgradePrice()+" to upgrade.");
                    if (scanner.nextLine().equals("Y"))
                    {
                        if (player.getMoney() >= space.getUpgradePrice()) {
                            //take their money for the purchase
                            player.setMoney(player.getMoney() - space.getUpgradePrice());
                            space.setUpgradeLevel(1);
                            space.setOwner(playerNum);
                            //display the rent of the space
                            System.out.println("This exhibit will cost " + space.getRent() + " to view");
                            ui.dialogueBox.setText("This exhibit will cost " + space.getRent() + " to view");
                        } else {
                            //tell them they don't have enough
                            System.out.println("Sorry you don't have enough money!");
                            ui.dialogueBox.setText("Sorry you don't have enough money!");
                        }

                    }
                }
                //if someone else owns it
                else
                {
                    //make them pay rent
                    System.out.println(players.get(space.getOwner()).getName()+" owns this exhibit, pay £"+space.getRent());
                    ui.dialogueBox.setText(players.get(space.getOwner()).getName()+" owns this exhibit, pay £"+space.getRent());
                    player.setMoney(player.getMoney()-space.getRent());
                    players.get(space.getOwner()).setMoney(players.get(space.getOwner()).getMoney()+space.getRent());
                }
                if(player.getMoney()<0)
                {
                    System.out.println(player.getName()+" has gone bankrupt! You lose!");
                    ui.dialogueBox.setText(player.getName()+" has gone bankrupt! You lose!");
                    player.leaveGame();
                }

            } else
            {
                // if they've been skipped let them know and unskip them
                System.out.println("Player " + playerNum + ", your turn has been skipped");
                ui.dialogueBox.setText("Player " + playerNum + ", your turn has been skipped");
                player.setSkippedTurn(false);
            }
            go = false;
            System.out.println("Press enter to end your go.");
            ui.dialogueBox.setText("Press button to end your go.");
            while (!go)
            {
                System.out.println("");
            }
        }
    }
}
