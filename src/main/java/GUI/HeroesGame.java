package GUI;

import GUI.actionlisteners.*;
import components.interfaces.Hero;

import javax.swing.*;
import java.awt.*;

public class HeroesGame {

    private JFrame frame;
    private JPanel contentPane;
    private JTextField nameText;
    private JTextField strText;
    private JTextField dexText;
    private JTextField intText;
    private JTextField conText;
    private JButton strUP;
    private JButton dexUP;
    private JButton intUP;
    private JButton conUP;
    private JButton strDWN;
    private JButton dexDWN;
    private JButton intDWN;
    private JButton conDWN;
    private JButton resetBtn;
    private JButton cancelBtn;
    private JButton createBtn;
    private JRadioButton barbRB;
    private JRadioButton mageRB;
    private JPanel panelCreate;
    private JPanel panelShop;
    private JPanel panelBattle;
    private JLabel welcome;
    private JLabel classLabel;
    private JLabel nameLabel;
    private JLabel strLabel;
    private JLabel dexLabel;
    private JLabel intLabel;
    private JLabel conLabel;
    private JLabel pointsLeft;

    private static Hero hero1;
    private static Hero hero2;
    public enum Player {PLAYER1, PLAYER2};
    private static Player activePlayer = Player.PLAYER1;

    private static int attributePointsLeft = 16;

    public static int getAttributePointsLeft() {
        return attributePointsLeft;
    }

    public static void setAttributePointsLeft(int attributePointsLeft) {
        HeroesGame.attributePointsLeft = attributePointsLeft;
    }

    public static Hero getHero1() {
        return hero1;
    }

    public static void setHero1(Hero hero1) {
        HeroesGame.hero1 = hero1;
    }

    public static Hero getHero2() {
        return hero2;
    }

    public static void setHero2(Hero hero2) {
        HeroesGame.hero2 = hero2;
    }

    public static Player getActivePlayer() {
        return activePlayer;
    }

    public static void setActivePlayer(Player activePlayer) {
        HeroesGame.activePlayer = activePlayer;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                HeroesGame window = new HeroesGame();
                window.frame.setVisible(true);
            }
        });
    }

    public HeroesGame() {
        initializeGame();
    }

    public void initializeGame() {
        frame = new JFrame();
        frame.setSize(500, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(contentPane);

        panelCreate.setVisible(true);

        // Radio buttons
        barbRB.setActionCommand("BARB");
        mageRB.setActionCommand("MAGE");

        barbRB.addActionListener(new RBActionListener(strText, dexText, intText, conText, pointsLeft, barbRB, mageRB));
        mageRB.addActionListener(new RBActionListener(strText, dexText, intText, conText, pointsLeft, barbRB, mageRB));

        // + & - buttons
        strUP.setActionCommand("+");
        strDWN.setActionCommand("-");
        dexUP.setActionCommand("+");
        dexDWN.setActionCommand("-");
        intUP.setActionCommand("+");
        intDWN.setActionCommand("-");
        conUP.setActionCommand("+");
        conDWN.setActionCommand("-");

        strUP.addActionListener(new AttrModActionListener(strText, pointsLeft));
        strDWN.addActionListener(new AttrModActionListener(strText, pointsLeft));
        dexUP.addActionListener(new AttrModActionListener(dexText, pointsLeft));
        dexDWN.addActionListener(new AttrModActionListener(dexText, pointsLeft));
        intUP.addActionListener(new AttrModActionListener(intText, pointsLeft));
        intDWN.addActionListener(new AttrModActionListener(intText, pointsLeft));
        conUP.addActionListener(new AttrModActionListener(conText, pointsLeft));
        conDWN.addActionListener(new AttrModActionListener(conText, pointsLeft));

        // Bottom button row
        createBtn.setActionCommand("CREATE");
        resetBtn.setActionCommand("RESET");
        cancelBtn.setActionCommand("CANCEL");

        createBtn.addActionListener(new CreateListener(nameText, strText, dexText, intText, conText, barbRB, mageRB, panelCreate, panelShop, pointsLeft));
        resetBtn.addActionListener(new ResetListener(strText, dexText, intText, conText, barbRB, mageRB, pointsLeft));
        cancelBtn.addActionListener(new CancelListener());
    }
}
