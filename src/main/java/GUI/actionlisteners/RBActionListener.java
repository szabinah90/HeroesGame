package GUI.actionlisteners;

import GUI.HeroesGame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RBActionListener implements ActionListener {
    private JTextField strField;
    private JTextField dexField;
    private JTextField intFiel;
    private JTextField consField;
    private JLabel pointsLabel;
    private JRadioButton button1;
    private JRadioButton button2;

    public RBActionListener(JTextField strField, JTextField dexField, JTextField intFiel, JTextField consField, JLabel pointsLabel, JRadioButton button1, JRadioButton button2) {
        this.strField = strField;
        this.dexField = dexField;
        this.intFiel = intFiel;
        this.consField = consField;
        this.pointsLabel = pointsLabel;
        this.button1 = button1;
        this.button2 = button2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String action = actionEvent.getActionCommand();
        if (action.equals("BARB")) {
            strField.setText("6");
            dexField.setText("3");
            intFiel.setText("2");
            consField.setText("5");
            HeroesGame.setAttributePointsLeft(16);
            pointsLabel.setText("Points left: " + HeroesGame.getAttributePointsLeft());
            button1.setEnabled(false);
            button2.setEnabled(false);
        } else if (action.equals("MAGE")) {
            strField.setText("3");
            dexField.setText("4");
            intFiel.setText("6");
            consField.setText("3");
            HeroesGame.setAttributePointsLeft(16);
            pointsLabel.setText("Points left: " + HeroesGame.getAttributePointsLeft());
            button1.setEnabled(false);
            button2.setEnabled(false);
        }
    }
}
