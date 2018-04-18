package GUI.actionlisteners;

import GUI.HeroesGame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AttrModActionListener implements ActionListener{
    private JTextField relevantField;
    private JLabel pointsLabel;

    public AttrModActionListener(JTextField relevantField, JLabel pointsLabel) {
        this.relevantField = relevantField;
        this.pointsLabel = pointsLabel;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String action = actionEvent.getActionCommand();
        if (action.equals("+") && HeroesGame.getAttributePointsLeft() > 0) {
            int fieldValue = Integer.parseInt(relevantField.getText());
            relevantField.setText(String.valueOf(fieldValue + 1));
            HeroesGame.setAttributePointsLeft(HeroesGame.getAttributePointsLeft() - 1);
            pointsLabel.setText("Points left: " + HeroesGame.getAttributePointsLeft());
        } else if (action.equals("-") && Integer.parseInt(relevantField.getText()) > 1) {
            int fieldValue = Integer.parseInt(relevantField.getText());
            relevantField.setText(String.valueOf(fieldValue - 1));
            HeroesGame.setAttributePointsLeft(HeroesGame.getAttributePointsLeft() + 1);
            pointsLabel.setText("Points left: " + HeroesGame.getAttributePointsLeft());
        }
    }
}
