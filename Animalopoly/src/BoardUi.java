import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class BoardUi {
    JTextArea dialogueBox = new JTextArea("");
    JButton button1 = new JButton("");
    JButton button2 = new JButton("");
    ArrayList<JTextArea> propertyList = new ArrayList<JTextArea>();
    ArrayList<JTextArea> playersAtSquare = new ArrayList<JTextArea>();
    ArrayList<JTextArea> ownerBoxes = new ArrayList<JTextArea>();
    ArrayList<JTextArea> levelDisplays = new ArrayList<JTextArea>();
    ArrayList<JTextArea> rentLabel = new ArrayList<JTextArea>();
    ArrayList<JTextArea> priceMarker = new ArrayList<JTextArea>();
    public void start(Board board)
    {
        for (int i = 0; i < 26; i++)
        {
            propertyList.add(new JTextArea(board.spaces.get(i).getName()));
        }
        for (int i = 0; i < 26; i++)
        {
            playersAtSquare.add(new JTextArea());
        }
        for (int i = 0; i < 26; i++)
        {
            ownerBoxes.add(new JTextArea("Unowned"));
        }
        for (int i = 0; i < 26; i++)
        {
            levelDisplays.add(new JTextArea("Level: 0"));
        }
        for (int i = 0; i < 26; i++)
        {
            rentLabel.add(new JTextArea());
        }
        for (int i = 0; i < 26; i++)
        {
            priceMarker.add(new JTextArea("Price: "+board.spaces.get(i).getUpgradePrice()));
        }
        JFrame window = new JFrame();
        window.setTitle("Animopoly");
        window.setSize(2000, 1000);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        boardSquares DC = new boardSquares();
        for (int i = 0; i < 8; i++)
        {
            window.add(propertyList.get(i));
            JTextArea obj = propertyList.get(i);
            obj.setBounds(i*100+201, 51, 98, 15);
            window.add(playersAtSquare.get(i));
            JTextArea obj2 = playersAtSquare.get(i);
            obj2.setBounds(i*100+201, 67, 98, 15);
            window.add(ownerBoxes.get(i));
            JTextArea obj3 = ownerBoxes.get(i);
            obj3.setBounds(i*100+201, 83, 98, 15);
            window.add(levelDisplays.get(i));
            JTextArea obj4 = levelDisplays.get(i);
            obj4.setBounds(i*100+201, 99, 98, 15);
            window.add(rentLabel.get(i));
            JTextArea obj5 = rentLabel.get(i);
            obj5.setBounds(i*100+201, 115, 98, 15);
            window.add(priceMarker.get(i));
            JTextArea obj6 = priceMarker.get(i);
            obj6.setBounds(i*100+201, 131, 98, 15);
        }
        for (int i = 8; i < 14; i++)
        {
            window.add(propertyList.get(i));
            JTextArea obj = propertyList.get(i);
            obj.setBounds(901, 51+100*(i-8), 98, 15);
            window.add(playersAtSquare.get(i));
            JTextArea obj2 = playersAtSquare.get(i);
            obj2.setBounds(901, 67+100*(i-8), 98, 15);
            window.add(ownerBoxes.get(i));
            JTextArea obj3 = ownerBoxes.get(i);
            obj3.setBounds(901, 83+100*(i-8), 98, 15);
            window.add(levelDisplays.get(i));
            JTextArea obj4 = levelDisplays.get(i);
            obj4.setBounds(901, 99+100*(i-8), 98, 15);
            window.add(rentLabel.get(i));
            JTextArea obj5 = rentLabel.get(i);
            obj5.setBounds(901, 115+100*(i-8), 98, 15);
            window.add(priceMarker.get(i));
            JTextArea obj6 = priceMarker.get(i);
            obj6.setBounds(901, 131+100*(i-8), 98, 15);
        }
        for (int i = 14; i < 21; i++)
        {
            window.add(propertyList.get(i));
            JTextArea obj = propertyList.get(i);
            obj.setBounds(801-(i-14)*100, 551, 98, 15);
            window.add(playersAtSquare.get(i));
            JTextArea obj2 = playersAtSquare.get(i);
            obj2.setBounds(801-(i-14)*100, 567, 98, 15);
            window.add(ownerBoxes.get(i));
            JTextArea obj3 = ownerBoxes.get(i);
            obj3.setBounds(801-(i-14)*100, 583, 98, 15);
            window.add(levelDisplays.get(i));
            JTextArea obj4 = levelDisplays.get(i);
            obj4.setBounds(801-(i-14)*100, 599, 98, 15);
            window.add(rentLabel.get(i));
            JTextArea obj5 = rentLabel.get(i);
            obj5.setBounds(801-(i-14)*100, 615, 98, 15);
            window.add(priceMarker.get(i));
            JTextArea obj6 = priceMarker.get(i);
            obj6.setBounds(801-(i-14)*100, 631, 98, 15);
        }
        for (int i = 21; i < 26; i++)
        {
            window.add(propertyList.get(i));
            JTextArea obj = propertyList.get(i);
            obj.setBounds(201, 551-100*(i-21), 98, 15);
            window.add(playersAtSquare.get(i));
            JTextArea obj2 = playersAtSquare.get(i);
            obj2.setBounds(201, 567-100*(i-21), 98, 15);
            window.add(ownerBoxes.get(i));
            JTextArea obj3 = ownerBoxes.get(i);
            obj3.setBounds(201, 583-100*(i-21), 98, 15);
            window.add(levelDisplays.get(i));
            JTextArea obj4 = levelDisplays.get(i);
            obj4.setBounds(201, 599-100*(i-21), 98, 15);
            window.add(rentLabel.get(i));
            JTextArea obj5 = rentLabel.get(i);
            obj5.setBounds(201, 615-100*(i-21), 98, 15);
            window.add(priceMarker.get(i));
            JTextArea obj6 = priceMarker.get(i);
            obj6.setBounds(201, 631-100*(i-21), 98, 15);
        }
        window.add(dialogueBox);
        dialogueBox.setBounds(1100,0,800,450);
        window.add(button1);
        window.add(button2);
        button1.setBounds(1100,500,400,200);
        button2.setBounds(1100,700,400,200);
        window.add(DC);
        for (int i = 0; i < board.players.size(); i++)
        {
            playersAtSquare.get(0).setText(playersAtSquare.get(0).getText()+" "+board.players.get(i).getCharacter());
        }
    }
}
class boardSquares extends JComponent{
    public void paint(Graphics graph0){
        Graphics2D graph = (Graphics2D) graph0;
        graph.setColor(Color.BLACK);
        for (int i = 0; i < 8; i++)
        {
            graph.draw(new Rectangle(i*100+200, 50, 100, 100));
        }
        for (int i = 0; i < 6; i++)
        {
            graph.draw(new Rectangle(900, 50+100*i, 100, 100));
        }
        for (int i = 0; i < 7; i++)
        {
            graph.draw(new Rectangle(i*100+200, 550, 100, 100));
        }
        for (int i = 0; i < 5; i++)
        {
            graph.draw(new Rectangle(200, 50+100*i, 100, 100));
        }
    }
}
