package View;

import Controller.Connexion.LogIn;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameLogIn extends JFrame {

    private JTextField pseudoField;
    private JPasswordField motDePasseField;

    public FrameLogIn() {
        setTitle("Page de Connexion");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        pseudoField = new JTextField(20);
        motDePasseField = new JPasswordField(20);
        JButton boutonConnexion = new JButton("Se Connecter");

        boutonConnexion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pseudo = pseudoField.getText();
                String motDePasse = new String(motDePasseField.getPassword());

                Controller.Connexion.LogIn.seConnecter(pseudo, motDePasse);

                JOptionPane.showMessageDialog(FrameLogIn.this,
                        "Pseudo: " + pseudo + "\nMot de Passe: " + motDePasse,
                        "Informations de Connexion",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        panel.add(new JLabel("Pseudo:"));
        panel.add(pseudoField);
        panel.add(new JLabel("Mot de Passe:"));
        panel.add(motDePasseField);
        panel.add(boutonConnexion);

        add(panel);

        setVisible(true);
    }

    
}