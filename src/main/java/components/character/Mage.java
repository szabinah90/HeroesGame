package components.character;

import components.interfaces.Hero;

public class Mage extends Player implements Hero {
    public Mage(String name, int STR, int DEX, int INT, int CON) {
        super(name, STR, DEX, INT, CON);
    }
}
