import java.util.ArrayList;
public class Main {
    public static void main(String[] args)
    {
        Board board = new Board();
        board.intitialise();
        while(!board.won)
        {
            for (int i = 0; i < board.players.size()-1; i++)
            {
                board.doATurn(i);
            }
        }
    }
}