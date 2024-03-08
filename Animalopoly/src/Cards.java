import java.util.ArrayList;
import java.util.Random;
public class Cards
{
    public String getCard(int randy)
    {
        String words;
        switch(randy){
            case 0:
                words = "WAAAAAAAAAAAAAAAAAAAAAA";
            default:
                words = "MAJOR CARD ERRREREOR";
        }
        return words;
    }
}
