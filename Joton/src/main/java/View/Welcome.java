package View;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Welcome extends JFrame {

    private static final long serialVersionUID = -4939544011287453046L;
    
    JButton login = new JButton( "Me connecter" );
    JButton register = new JButton( "Créer un nouveau profil" );



    public Welcome() {
        super( "Bienvenue sur Joton !" );
        this.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
        this.setSize( 600, 400 );
        this.setLocationRelativeTo( null );

        JPanel contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add( login );
        contentPane.add( register );
        
        //ActionListener controleur = new ActionListener(this); //controleur qui écoute tous les clics sur l'interface graphique

        
        //JCheckBox kindOfUser = new JCheckBox( "Type de profil" );
        //contentPane.add( kindOfUser );
        
        //JTextField txtEditMe = new JTextField( "Edit me!" );
        //txtEditMe.setPreferredSize( new Dimension( 120,  30 ) );
        //contentPane.add( txtEditMe );
        
        login.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ae) {
				// TODO Auto-generated method stub
				
			}			   
		
        });
    }
    
    public static void main(String[] args) throws Exception {
        // Apply a look'n feel
        UIManager.setLookAndFeel( new NimbusLookAndFeel() );
        
        // Start my window
        Welcome myWindow = new Welcome();
        myWindow.setVisible( true );
    } 

}
