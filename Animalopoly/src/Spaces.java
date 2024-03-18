import org.w3c.dom.ls.LSOutput;

public class Spaces {
    // Stores the space's position, 0 being the start, to 25 being zebra.
    private int num;
    // Stores the name of the space.
    private String name;
    // Stores the player number of the owner, (I think null if there is no owner).
    private int owner;
    // Stores the: Latin name, what it is,where it lives, how big it is and if it is endangered.
    private String info;
    // Stores the price needed to upgrade to the next level.
    private int upgradePrice;
    // Stores the current level, starting at 0.
    private int upgradeLevel = 0;
    // Makes a SpacesInfo object to pull all info needed from
    SpacesInfo namer = new SpacesInfo();

    // Constructor. Space number is passed through. Name, Fact and base upgrade price are all pulled from SpacesInfo.
    public Spaces(int num)  {
        this.num = num;
        name = namer.getSpaceName(this.num);
        info = namer.getSpaceFact(this.num);
        if(this.num == 0 || this.num == 13){
            upgradePrice = 999999999;
            upgradeLevel = 999999999;
            // probably should change this, but it means they can't buy the start and skip a turn spaces.
        }
        else {
            upgradePrice = namer.setBasePrice();
        }
    }
    // Prints the name. (probably not needed).
    public void printName() {System.out.println(name);}
    // Returns the name.
    public String getName(){return name;}
    // Prints the Facts. (probably not needed).
    public void printInfo() {
        System.out.println(info);
    }
    // Returns the Facts.
    public String getInfo(){
        return info;
    }

    // Adds 1 to the level, max level is 4, also changes the upgrade price to the next one. (might need to mess around with the order of this).
    public void upgrade() {
        if (upgradeLevel != 4) {
            setUpgradePrice(namer.setUpgradePrice(upgradeLevel));
            upgradeLevel = upgradeLevel + 1;
        }
    }

    // Returns the upgrade price.
    public int getUpgradePrice(){return upgradePrice;}

    // Sets new upgrade price.
    public void setUpgradePrice(int upgradePrice) {
        this.upgradePrice = upgradePrice;
    }

    // Returns the current level
    public int getUpgradeLevel(){return upgradeLevel;}

    // Sets a new upgrade level
    public void setUpgradeLevel(int upgradeLevel) {
        this.upgradeLevel = upgradeLevel;
    }

    // Sets the owner via player number
    public void setOwner(int ownNum){owner = ownNum;}

    // returns the owner's number
    public int getOwner(){return owner;}

    // Returns the money a player will have to pay if they land on this space, level 0 means rent is 0.
    public int getRent(){return namer.getRent(upgradeLevel);}
}
