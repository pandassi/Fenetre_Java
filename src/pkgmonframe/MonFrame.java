 
package pkgmonframe;
 
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MonFrame extends JFrame {
    private int hauteur=200;
 private int largeur=300;
 private JButton btn1,btn2,btn3;
private  JLabel lblEtiq1,lblEtiq2,lblEtiq3;
JTextField txtNom;
private JPanel pnl;
public MonFrame()  {
   pnl=new JPanel();
        this.setTitle("Premier projet graphique");
        this.setSize(largeur, hauteur);
        btn2=new JButton("zwei");
        btn3=new JButton("trei");
        btn1=new JButton("Eins");
        pnl.add(btn1);pnl.add(btn2);pnl.add(btn3);
        lblEtiq1=new JLabel("un");
         lblEtiq2=new JLabel("deux");
          lblEtiq3=new JLabel("trois");
       pnl.add(lblEtiq1); pnl.add(lblEtiq2);
        pnl.add(lblEtiq3);
       txtNom=new JTextField("Vers l’infini, et plus loin encore!");
       txtNom.setPreferredSize(new Dimension(200,50));
       pnl.add(txtNom);
       this.add(pnl);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        permuter();
    }        
     public void permuter()
     {
         String temp;
         temp=btn1.getText();
         btn1.setText(lblEtiq1.getText());
         lblEtiq1.setText(temp);
          temp=btn2.getText();
         btn2.setText(lblEtiq2.getText());
         lblEtiq2.setText(temp);
          temp=btn3.getText();
         btn3.setText(lblEtiq3.getText());
         lblEtiq3.setText(temp);
     }         
             
    
}
