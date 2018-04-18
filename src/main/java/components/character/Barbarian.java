package components.character;

import components.interfaces.Hero;

public class Barbarian extends Player implements Hero{
    public Barbarian(String name, int STR, int DEX, int INT, int CON) {
        super(name, STR, DEX, INT, CON);
    }
}
