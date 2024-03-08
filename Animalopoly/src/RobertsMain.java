import javax.swing.*;
import java.util.ArrayList;

public class RobertsMain extends JFrame{
    public RobertsMain() {}

            public static void main(String[] args) {
                ArrayList<Spaces> spaces = new ArrayList<Spaces>();

                for (int i = 0; i < 27; i++) {
                    spaces.add(new Spaces(i));
                }

                //GUI mygui = new GUI(spaces);
            }
}



