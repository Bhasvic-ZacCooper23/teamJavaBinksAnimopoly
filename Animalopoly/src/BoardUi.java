import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class BoardUi {
    public void start(Board board)
    {
        ArrayList<JTextArea> propertyList = new ArrayList<JTextArea>();
        for (int i = 0; i < 28; i++)
        {
            propertyList.add(new JTextArea(Integer.toString(i)));
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
            obj.setBounds(i*100+250, 100, 20, 20);
        }
        for (int i = 8; i < 14; i++)
        {
            window.add(propertyList.get(i));
            JTextArea obj = propertyList.get(i);
            obj.setBounds(950, 100+100*(i-8), 20, 20);
        }
        for (int i = 14; i < 21; i++)
        {
            window.add(propertyList.get(i));
            JTextArea obj = propertyList.get(i);
            obj.setBounds(850-(i-14)*100, 700, 20, 20);
        }
        for (int i = 21; i < 26; i++)
        {
            window.add(propertyList.get(i));
            JTextArea obj = propertyList.get(i);
            obj.setBounds(250, 600-100*(i-21), 20, 20);
        }
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
