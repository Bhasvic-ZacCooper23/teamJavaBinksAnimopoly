import org.w3c.dom.ls.LSOutput;

public class Spaces {
    private int num;
    private String name;
    private int owner;
    private String fact;
    private int upgradePrice;
    private int upgradeLevel = 0;
    SpacesInfo namer = new SpacesInfo();

    public Spaces(int num) {
        this.num = num;
        name = namer.getSpaceName(this.num);
        fact = namer.getSpaceFact(this.num);
        upgradePrice = namer.setBasePrice();
    }
    public void printName() {System.out.println(name);}
    public String getName(){return name;}
    public void printFact() {
        System.out.println(fact);
    }

    public String getInfo(){
        return fact;
    }

    public void upgrade() {
        if (upgradeLevel != 4) {
            upgradePrice = namer.setUpgradePrice(upgradeLevel);
            upgradeLevel = upgradeLevel + 1;
        }
    }

    public int getUpgradePrice(){return upgradePrice;}

    public void setUpgradePrice(int upgradePrice) {
        this.upgradePrice = upgradePrice;
    }

    public int getUpgradeLevel(){return upgradeLevel;}

    public void setUpgradeLevel(int upgradeLevel) {
        this.upgradeLevel = upgradeLevel;
    }

    public void setOwner(int ownNum){owner = ownNum;}

    public int getOwner(){return owner;}

    //placeholder for rent code, please do rent ASAP Robert

    public int getRent()
    {
        return 50;
    }
}
