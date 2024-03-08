import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GUI extends JFrame{
    private JButton Dice;
    private JPanel mainPanel;
    private JTextPane textPane1;
    private JButton submitButton;
    private JComboBox boxMethodSpaces;
    private JComboBox boxListSpaces;
    private JTextPane textPane2;

    private ArrayList<Spaces> spacesList= new ArrayList<Spaces>();

    public GUI(ArrayList<Spaces> spacesPassed) {

    spacesList = spacesPassed;
    setContentPane(mainPanel);
    setTitle("Mystic Preditor");
    setSize(500,500);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);


    Dice.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Die dice = new Die();
            int result1 = dice.roll();
            int result2 = dice.roll();
            if (result1 == result2){
                textPane1.setText(String.valueOf(result1 + "+" + result2 + "=" + (result1 + result2) + "\n DOUBLE"));
            }
            else{
                textPane1.setText(String.valueOf(result1 + "+" + result2 + "=" + (result1 + result2)));
            }
        }
    });


        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = (String)boxListSpaces.getSelectedItem();
                int spaceNum = Integer.parseInt(text);
                int method = boxMethodSpaces.getSelectedIndex();

                switch(method){
                    case 0:
                        textPane2.setText(spacesList.get(spaceNum).getName());
                        break;
                    case 1:
                        textPane2.setText(spacesList.get(spaceNum).getFact());
                        break;
                    case 2:
                        textPane2.setText(String.valueOf(spacesList.get(spaceNum).getUpgradePrice()));
                        break;
                    case 3:
                        textPane2.setText(String.valueOf(spacesList.get(spaceNum).getLevel()));
                        break;
                    case 4:
                        spacesList.get(spaceNum).upgrade();
                        textPane2.setText("upgraded");
                        break;

                }


            }
        });
    }
}
