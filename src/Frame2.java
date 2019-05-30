/* With the help of professor Sonia Gounar */

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

public class Frame2 extends JFrame {

    private JPanel pnl1 = new JPanel(new BorderLayout());
    private JPanel pnl2 = new JPanel();
    private JPanel pnl3 = new JPanel(new BorderLayout());
    private JPanel pnl4 = new JPanel();
    JButton btn1 = new JButton("Boutton1");
    JButton btn4 = new JButton("Boutton4");
    JButton btn2 = new JButton("Boutton2");
    JButton btn3 = new JButton("Boutton3");

    public Frame2() {
        this.setTitle("Layout");
        pnl2.add(btn1);
        pnl3.add(btn2,BorderLayout.NORTH);
        pnl3.add(btn3,BorderLayout.CENTER);
        pnl3.add(btn4,BorderLayout.WEST);
        pnl1.add(pnl2,BorderLayout.NORTH);
        pnl1.add(pnl3,BorderLayout.SOUTH);
        pnl1.add(pnl4,BorderLayout.CENTER);
        this.add(pnl1);
        this.setSize(500, 600);
        pnl1.setBackground(Color.blue);
        pnl2.setBackground(Color.yellow);
         pnl3.setBackground(Color.green);
          pnl4.setBackground(Color.cyan);
         this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
