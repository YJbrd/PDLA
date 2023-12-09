package View;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Welcome extends JFrame {

    private static final long serialVersionUID = -4939544011287453046L;

    public Welcome() {
        super( "Bienvenue sur Joton !" );
        this.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
        this.setSize( 600, 400 );
        this.setLocationRelativeTo( null );

        JPanel contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout( new FlowLayout() );
        
        JButton login = new JButton( "Me connecter" );
        contentPane.add( login );
        
        JButton register = new JButton( "Créer un nouveau profil" );
        contentPane.add( register );
        
        //JCheckBox kindOfUser = new JCheckBox( "Type de profil" );
        //contentPane.add( kindOfUser );
        
        //JTextField txtEditMe = new JTextField( "Edit me!" );
        //txtEditMe.setPreferredSize( new Dimension( 120,  30 ) );
        //contentPane.add( txtEditMe );
    }
    
    public static void main(String[] args) throws Exception {
        // Apply a look'n feel
        UIManager.setLookAndFeel( new NimbusLookAndFeel() );
        
        // Start my window
        Welcome myWindow = new Welcome();
        myWindow.setVisible( true );
    }

}
