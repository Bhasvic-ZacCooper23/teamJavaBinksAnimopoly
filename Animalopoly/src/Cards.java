import java.util.ArrayList;
import java.util.Random;
public class Cards
{
    public String getCard(int randy)
    {
        // big switch case of all the cards, actual effect will be hard coded into the (board?) default is an error message.
        String words;
        switch(randy){
            case 0:
                words = "Snake bite! skip a turn while in the hospital";
                // skip turn
                break;
            case 1:
                words = "Monkey attack! The monkeys stole £300 from your wallet and ran of with it to start a successful coffee chain, they were thankful for your initial donation and decided to give you £1000 to show their appreciation.";
                // +£700
                break;
            case 2:
                words = "Lions maul you and you have to go overseas to find a good surgeon to fix your face, lose £500.";
                // -£500
                break;
            case 3:
                words = "You fall into a gorilla enclosure and the staff have to kill the gorilla to get you out, everyone now hates you, skip a turn while you cry from all the cyberbullying ";
                // skip a turn
                break;
            case 4:
                words = "You find £200 on the ground.";
                // +£200
                break;
            case 5:
                words = "You die.";
                // You die
                break;
            case 6:
                words = "Your estranged grandma dies. Gain £2000";
                // +£2000
                break;
            case 7:
                words = "You marry the partner of your dreams. Lose £500 to pay for the wedding";
                // -£500
                break;
            case 8:
                words = "You see an ULTIMATE SHREW and buy it immediately because its so cool. Lose £100 but its worth it.";
                // -£100
                break;
            case 9:
                words = "You discover a new species, gain nothing.";
                //
                break;
            case 10:
                words = "Gain £100 through suspicious means";
                // +£100
                break;
            case 11:
                words = "Some cats helped you commit tax evasion, gain £300";
                // +£300
                break;
            case 12:
                words = "Monkey attack! Your stocks are stolen off the blockchain by cybermonkeys, none of it was real anyway so you lose nothing";
                //
                break;
            case 13:
                words = "NFT, +£600";
                // +£600
                break;
            case 14:
                words = "NFT, -£700";
                // -£700
                break;
            case 15:
                words = "You get a tattoo of an ULTIMATE SHREW, lose £100 but be significantly cooler.";
                // -£100
                break;
            case 16:
                words = "Capitalism, lose £500";
                // -£500
                break;
            case 17:
                words = "Your bank explodes, lose everything.";
                // lose everything
                break;
            case 18:
                words = "Someone else's bank explodes, find £3000";
                // +£3000
                break;
            case 19:
                words = "Ỳ̷͕ō̴̘u̶̲͆ ̴̙̓s̴͚̓u̷̦͑ḿ̶̘m̸͉̈́o̴̢͊n̴͎̂ ̸͎͋ẗ̵̡ḩ̷̚e̸̦̓ ̵͉͊ḍ̵͛a̷̻̚r̶͖̀k̸̬͠ ̴̳̌l̷̤̔o̴͓̒ȓ̶͖d̴̻̑ ̵̦̀ă̴̞n̴̖̕d̸͕̾ ̵͕̃h̴̠̃ë̴͇́ ̶͙̎g̶͍̀i̴̬̍v̵̗̍e̶̬͒s̵͓̏ ̸̢̍y̸̜͑ó̶̘u̶̖͊ ̵̠͂£̴̺̈5̵̳̔0̴̯̍";
                // +£50
                break;
            default:
                words = "MAJOR CARD ERRREREOR";
                // ERROR
                break;
        }
        return words;
    }
}
