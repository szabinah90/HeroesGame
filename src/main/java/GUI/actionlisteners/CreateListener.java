package GUI.actionlisteners;

import GUI.HeroesGame;
import components.character.Barbarian;
import components.character.Mage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static GUI.HeroesGame.*;

public class CreateListener implements ActionListener {
    private JTextField name;
    private JTextField str;
    private JTextField dex;
    private JTextField inT;
    private JTextField con;
    private JRadioButton bar;
    private JRadioButton mage;
    private JPanel create;
    private JPanel shop;
    private JLabel points;

    public CreateListener(JTextField name, JTextField str, JTextField dex, JTextField inT, JTextField con, JRadioButton bar, JRadioButton mage, JPanel create, JPanel shop, JLabel points) {
        this.name = name;
        this.str = str;
        this.dex = dex;
        this.inT = inT;
        this.con = con;
        this.bar = bar;
        this.mage = mage;
        this.create = create;
        this.shop = shop;
        this.points = points;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (HeroesGame.getActivePlayer() == Player.PLAYER1) {
            if (bar.isSelected()) {
                HeroesGame.setHero1(new Barbarian(name.getText(), Integer.parseInt(str.getText()), Integer.parseInt(dex.getText()), Integer.parseInt(inT.getText()), Integer.parseInt(con.getText())));
            } else {
                HeroesGame.setHero1(new Mage(name.getText(), Integer.parseInt(str.getText()), Integer.parseInt(dex.getText()), Integer.parseInt(inT.getText()), Integer.parseInt(con.getText())));
            }
            HeroesGame.setActivePlayer(Player.PLAYER2);

            name.setText("");
            str.setText("");
            dex.setText("");
            inT.setText("");
            con.setText("");
            HeroesGame.setAttributePointsLeft(16);
            points.setText("Points left: " + HeroesGame.getAttributePointsLeft());
            bar.setEnabled(true);
            mage.setEnabled(true);


        } else {
            if (bar.isSelected()) {
                HeroesGame.setHero2(new Barbarian(name.getText(), Integer.parseInt(str.getText()), Integer.parseInt(dex.getText()), Integer.parseInt(inT.getText()), Integer.parseInt(con.getText())));
            } else {
                HeroesGame.setHero2(new Mage(name.getText(), Integer.parseInt(str.getText()), Integer.parseInt(dex.getText()), Integer.parseInt(inT.getText()), Integer.parseInt(con.getText())));
                HeroesGame.setActivePlayer(Player.PLAYER1);
            }
            System.out.println(getHero1());
            System.out.println(getHero2());
            create.setVisible(false);
            shop.setVisible(true);
        }
    }
}
