package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameMain extends JFrame {

    private JLabel labelUtilisateur;
    private JLabel labelTypeUtilisateur;
    private JButton boutonAjouterDemande;
    private DefaultListModel<String> listeDemandesModel;
    private JList<String> listeDemandes;

    public FrameMain(String pseudoUtilisateur, String typeUtilisateur) {
        setTitle("Page Principale");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // En-tête de la page
        JPanel headerPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        labelUtilisateur = new JLabel("Pseudo: " + pseudoUtilisateur);
        labelTypeUtilisateur = new JLabel("Type d'Utilisateur: " + typeUtilisateur);
        headerPanel.add(labelUtilisateur);
        headerPanel.add(labelTypeUtilisateur);

        // Bouton pour ajouter des demandes
        boutonAjouterDemande = new JButton("Ajouter une Demande");
        boutonAjouterDemande.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                SwingUtilities.invokeLater(() -> new FrameFormTask(pseudoUtilisateur));

                // Vous pouvez ouvrir une nouvelle fenêtre de création de demande, par exemple
            }
        });

        // Liste des demandes
        listeDemandesModel = new DefaultListModel<>();
        listeDemandes = new JList<>(listeDemandesModel);
        JScrollPane scrollPane = new JScrollPane(listeDemandes);

        // Agencement global avec GridBagLayout
        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        mainPanel.add(headerPanel, gbc);

        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        mainPanel.add(boutonAjouterDemande, gbc);

        gbc.gridy = 2;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        mainPanel.add(scrollPane, gbc);

        add(mainPanel);

        setVisible(true);
    }

}
