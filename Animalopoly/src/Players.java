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
    private int die;


 
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
    /**
     * Sets the random number player will go.
     */
    public void rolledDice(){
        Die die = new Die();
        this.die = die.roll();
    }
}
