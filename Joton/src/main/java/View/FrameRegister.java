package View;

import Controller.Connexion.Register;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameRegister extends JFrame {

    private JTextField pseudoField;
    private JPasswordField motDePasseField;
    private JComboBox<String> typeUtilisateurComboBox;

    public FrameRegister() {
        setTitle("Page d'Enregistrement");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        pseudoField = new JTextField(20);
        motDePasseField = new JPasswordField(20);

        typeUtilisateurComboBox = new JComboBox<>(new String[]{"B�n�vole", "Validateur", "Vuln�rable"});

        JButton boutonEnregistrement = new JButton("S'enregistrer");

        boutonEnregistrement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pseudo = pseudoField.getText();
                String motDePasse = new String(motDePasseField.getPassword());
                String typeUtilisateur = (String) typeUtilisateurComboBox.getSelectedItem();

                Controller.Connexion.Register.enregistrerUtilisateur(pseudo, motDePasse, typeUtilisateur);

                JOptionPane.showMessageDialog(FrameRegister.this,
                        "Enregistrement r�ussi!\nPseudo: " + pseudo + "\nMot de Passe: " + motDePasse + "\nType d'Utilisateur: " + typeUtilisateur,
                        "Informations d'Enregistrement",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        panel.add(new JLabel("Pseudo:"));
        panel.add(pseudoField);
        panel.add(new JLabel("Mot de Passe:"));
        panel.add(motDePasseField);
        panel.add(new JLabel("Type d'Utilisateur:"));
        panel.add(typeUtilisateurComboBox);
        panel.add(boutonEnregistrement);

        add(panel);

        setVisible(true);
    }
}