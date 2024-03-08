<<<<<<< Updated upstream
/**
 * The Players class represents a player in the Animalopoly game.
 */
public class Players {
    private String name;
    private Character symbol;
    private int money;
    private boolean skippedTurn;
    private boolean lost;
    private int position;
import java.util.Scanner;

public class Players
{
    int position;
    int money;
    public void Main(String[] args)
    {
        setMoney(500);
        setPosition(0);
    }
    public String setName(String s)
    {
        Scanner scanner = new Scanner(System.in);
        String nickname = scanner.nextLine();
        return nickname;
    }
    public void setMoney(int num) {
        money = num;
        System.out.println(this.setName() + " has " + money + "£");
    }
    public int getPosition()
    {
        return position;
    }
    public void setPosition(int num)
    {
        position = num;

    }
    public boolean skippedTurn()
    {
        boolean check = this.getPosition() == 2;
        return check;
    }
    public void getCard()
    {

    }
>>>>>>> Stashed changes

    /**
     * Sets the name of the player.
     * 
     * @param nickname the nickname of the player
     */
    public void setName(String nickname) {
        this.name = nickname;
    }

    /**
     * Returns the name of the player.
     * 
     * @return the name of the player
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the character symbol of the player.
     * 
     * @param character the character symbol of the player
     */
    public void setCharacter(Character character) {
        this.symbol = character;
    }

    /**
     * Returns the character symbol of the player.
     * 
     * @return the character symbol of the player
     */
    public Character getCharacter() {
        return this.symbol;
    }

    /**
     * Returns whether the player has skipped their turn.
     * 
     * @return true if the player has skipped their turn, false otherwise
     */
    public boolean getSkippedTurn() {
        return this.skippedTurn;
    }

    /**
     * Sets whether the player has skipped their turn.
     * 
     * @param turn true if the player has skipped their turn, false otherwise
     */
    public void setSkippedTurn(boolean turn) {
        this.skippedTurn = turn;
    }

    /**
     * Sets the position of the player on the game board.
     * 
     * @param pos the position of the player
     */
    public void setPosition(int pos) {
        this.position = pos;
    }

    /**
     * Returns the position of the player on the game board.
     * 
     * @return the position of the player
     */
    public int getPosition() {
        return this.position;
    }

    /**
     * Sets the amount of money the player has.
     * 
     * @param mon the amount of money the player has
     */
    public void setMoney(int mon) {
        this.money = mon;
    }

    /**
     * Returns the amount of money the player has.
     * 
     * @return the amount of money the player has
     */
    public int getMoney() {
        return this.money;
    }

    private void setLost(boolean lost) {
        this.lost = lost;
    }

    /**
     * Returns whether the player has lost the game.
     * 
     * @return true if the player has lost the game, false otherwise
     */
    public boolean getLost() {
        return this.lost;
    }

    /**
     * Sets the player as lost in the game.
     */
    public void leaveGame() {
        this.setLost(true);
    }
}
