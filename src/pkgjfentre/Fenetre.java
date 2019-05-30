 
package pkgjfentre;
 
import java.awt.Dimension;
import javax.swing.*;

public class Fenetre extends JFrame{
 private int hauteur=200;
 private int largeur=300;
 private JButton btnOk;
private  JLabel lblEtiq;
JTextField txtNom;
private JPanel pnl;
    public Fenetre()
    {    pnl=new JPanel();
        this.setTitle("Premier projet graphique");
        this.setSize(largeur, hauteur);
        btnOk=new JButton("OK");
        pnl.add(btnOk);
        lblEtiq=new JLabel("Salut je suis une étiquette");
       pnl.add(lblEtiq);
       txtNom=new JTextField();
       txtNom.setPreferredSize(new Dimension(50,50));
       pnl.add(txtNom);
       this.add(pnl);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }        
            
    
}
