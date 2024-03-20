public class ZacsMain {
    public static void main(String[] args) throws InterruptedException {
        //create the board
        Board board = new Board();
        //call the board method
        board.initialise();
        board.ui.start(board);
        //board.jFrame.setVisible(true);
        int numberOfPlayersLost = 0;
        //until someone has won
        while(numberOfPlayersLost<3)
        {
            for (int i = 0; i < board.players.size(); i++)
            {
                if(board.players.get(i).getLost())
                {
                    numberOfPlayersLost++;
                }
            }
            //do turns for how many players there are
            for (int i = 0; i < board.players.size(); i++)
            {
                board.doATurn(i);
            }
        }
        int i;
        for (i = 0; i < board.players.size(); i++)
        {
            if(!board.players.get(i).getLost())
            {
                numberOfPlayersLost = i;
            }
        }
        board.ui.dialogueBox.setText("Player "+ i +" has won!"+"\nGreat job "+board.players.get(i-1).getName()+"!");
        board.ui.dialogueBox.setBackground(board.players.get(i-1).getColour());
        board.ui.button1.setText("");
    }
}