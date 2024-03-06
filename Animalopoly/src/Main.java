import java.util.ArrayList;
public class Main {
    public static void main(String[] args)
    {
        //create the board
        Board board = new Board();
        //call the board method
        board.intitialise();
        //until someone has won
        while(!board.won)
        {
            //do turns for how many players there are
            for (int i = 0; i < board.players.size()-1; i++)
            {
                board.doATurn(i);
            }
        }
    }
}