import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class BoardUi {
    JTextArea dialogueBox = new JTextArea("");
    JButton button1 = new JButton("");
    JButton button2 = new JButton("");
    public void start(Board board)
    {
        ArrayList<JTextArea> propertyList = new ArrayList<JTextArea>();
        for (int i = 0; i < 26; i++)
        {
            propertyList.add(new JTextArea(board.spaces.get(i).getName()));
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
            obj.setBounds(i*100+201, 51, 98, 20);
        }
        for (int i = 8; i < 14; i++)
        {
            window.add(propertyList.get(i));
            JTextArea obj = propertyList.get(i);
            obj.setBounds(901, 51+100*(i-8), 98, 20);
        }
        for (int i = 14; i < 21; i++)
        {
            window.add(propertyList.get(i));
            JTextArea obj = propertyList.get(i);
            obj.setBounds(801-(i-14)*100, 551, 98, 20);
        }
        for (int i = 21; i < 26; i++)
        {
            window.add(propertyList.get(i));
            JTextArea obj = propertyList.get(i);
            obj.setBounds(201, 551-100*(i-21), 98, 20);
        }
        window.add(dialogueBox);
        dialogueBox.setBounds(1100,0,800,450);
        window.add(button1);
        window.add(button2);
        button1.setBounds(1100,500,500,200);
        button2.setBounds(1100,700,500,200);
        window.add(DC);
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
