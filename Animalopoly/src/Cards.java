import java.util.ArrayList;
import java.util.Random;
public class Cards
{
    public String getCard(int randy)
    {
        String words;
        switch(randy){
            case 0:
                words = "Discovered new species! Gain £100!";
            case 1:
                words = "Snake bite! Lose £200!";
            case 2:
                words = "Mauled by a tiger! Skip a turn!";
            default:
                words = "MAJOR CARD ERRREREOR";
        }
        return words;
    }
}
