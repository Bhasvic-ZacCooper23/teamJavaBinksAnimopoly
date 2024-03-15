public class ZacsMain {
    public static void main(String[] args) throws InterruptedException {
        //create the board
        Board board = new Board();
        //call the board method
        board.intitialise();
        board.ui.start(board);
        board.ui.dialogueBox.setText("Hello");
        //until someone has won
        while(1==1)
        {
            //do turns for how many players there are
            for (int i = 0; i < board.players.size(); i++)
            {
                board.doATurn(i);
            }
        }
    }
}