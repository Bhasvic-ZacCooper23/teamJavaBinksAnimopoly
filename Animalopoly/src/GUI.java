import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class GUI extends JFrame{
    private JButton Dice;
    private JPanel mainPanel;
    private JTextPane textPane1;
    private JButton submitButton;
    private JComboBox boxMethodSpaces;
    private JComboBox boxListSpaces;
    private JTextPane textPane2;
    private JTextPane textPane3;
    private JButton getCardButton;
    private JSlider slider1;
    private JProgressBar progressBar1;
    private JSpinner spinner1;
    private JScrollBar scrollBar1;

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
                Cards cardo = new Cards();
                Random random = new Random();
                int card = random.nextInt(20);
                String sting = cardo.getCard(card);
                textPane1.setText(String.valueOf(result1 + "+" + result2 + "=" + (result1 + result2) + "\nDOUBLE" + "\n\n" + sting));

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
                        textPane2.setText(spacesList.get(spaceNum).getInfo());
                        break;
                    case 2:
                        textPane2.setText(String.valueOf(spacesList.get(spaceNum).getUpgradePrice()));
                        break;
                    case 3:
                        textPane2.setText(String.valueOf(spacesList.get(spaceNum).getUpgradeLevel()));
                        break;
                    case 4:
                        textPane2.setText(String.valueOf(spacesList.get(spaceNum).getRent()));
                        break;
                    case 5:
                        spacesList.get(spaceNum).upgrade();
                        textPane2.setText("upgraded");
                        break;

                }


            }
        });
        getCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cards cardo = new Cards();
                Random random = new Random();
                int card = random.nextInt(20);
                String sting = cardo.getCard(card);
                textPane3.setText(String.valueOf(sting));
            }
        });
    }
}
