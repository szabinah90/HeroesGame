package GUI.actionlisteners;

import GUI.HeroesGame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetListener implements ActionListener {

    private JTextField str;
    private JTextField dex;
    private JTextField inT;
    private JTextField con;
    private JRadioButton bar;
    private JRadioButton mage;
    private JLabel points;

    public ResetListener(JTextField str, JTextField dex, JTextField inT, JTextField con, JRadioButton bar, JRadioButton mage, JLabel points) {
        this.str = str;
        this.dex = dex;
        this.inT = inT;
        this.con = con;
        this.bar = bar;
        this.mage = mage;
        this.points = points;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        str.setText("");
        dex.setText("");
        inT.setText("");
        con.setText("");
        HeroesGame.setAttributePointsLeft(16);
        points.setText("Points left: " + HeroesGame.getAttributePointsLeft());
        bar.setEnabled(true);
        mage.setEnabled(true);
    }
}
