import java.util.ArrayList;
import java.util.Random;
public class Cards
{
    public String getCard(int randy)
    {
        String words;
        switch(randy){
            case 0:
                words = "Snake bite! skip a turn while in the hospital";
                break;
            case 1:
                words = "Monkey attack! The monkeys stole £300 from your wallet and ran of with it to start a successful coffee chain, they were thankful for your initial donation and decided to give you £1000 to show their appreciation.";
                break;
            case 2:
                words = "Lions maul you and you have to go overseas to find a good surgeon to fix your face, lose £500.";
                break;
            case 3:
                words = "You fall into a gorilla enclosure and the staff have to kill the gorilla to get you out, everyone now hates you, skip a turn while you cry from all the cyberbullying ";
                break;
            case 4:
                words = "You find £200 on the ground.";
                break;
            case 5:
                words = "You die.";
                break;
            case 6:
                words = "Your estranged grandma dies. Gain £2000";
                break;
            case 7:
                words = "You marry the partner of your dreams. Lose £2000 to pay for the wedding";
                break;
            case 8:
                words = "You see an ULTIMATE SHREW and buy it immediately because its so cool. Lose £100 but its worth it.";
                break;
            case 9:
                words = "You discover a new species, gain nothing.";
                break;

            default:
                words = "MAJOR CARD ERRREREOR";
        }
        return words;
    }
}
