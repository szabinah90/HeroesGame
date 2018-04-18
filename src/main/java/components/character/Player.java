package components.character;

import components.interfaces.Hero;
import components.interfaces.Item;

import java.util.HashMap;

public abstract class Player implements Hero {
    private String name;
    private int STR;
    private int DEX;
    private int INT;
    private int CON;
    private HashMap<String, Item> inventory;
    private float offense;
    private float defense;
    private float healthPoints;
    private float actionPoints;
    private float turnActionPoints;

    public Player(String name, int STR, int DEX, int INT, int CON) {
        this.name = name;
        this.STR = STR;
        this.DEX = DEX;
        this.INT = INT;
        this.CON = CON;
        healthPoints = CON * 8.3f;
        actionPoints = 2 + DEX * 0.5f;
        turnActionPoints = 3 + DEX * 0.5f;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSTR() {
        return STR;
    }

    public void setSTR(int STR) {
        this.STR = STR;
    }

    public int getDEX() {
        return DEX;
    }

    public void setDEX(int DEX) {
        this.DEX = DEX;
    }

    public int getINT() {
        return INT;
    }

    public void setINT(int INT) {
        this.INT = INT;
    }

    public int getCON() {
        return CON;
    }

    public void setCON(int CON) {
        this.CON = CON;
    }

    public HashMap<String, Item> getInventory() {
        return inventory;
    }

    public void setInventory(HashMap<String, Item> inventory) {
        this.inventory = inventory;
    }

    public float getOffense() {
        return offense;
    }

    public void setOffense(float offense) {
        this.offense = offense;
    }

    public float getDefense() {
        return defense;
    }

    public void setDefense(float defense) {
        this.defense = defense;
    }

    public float getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(float healthPoints) {
        this.healthPoints = healthPoints;
    }

    public float getActionPoints() {
        return actionPoints;
    }

    public void setActionPoints(float actionPoints) {
        this.actionPoints = actionPoints;
    }

    public float getTurnActionPoints() {
        return turnActionPoints;
    }

    public void setTurnActionPoints(float turnActionPoints) {
        this.turnActionPoints = turnActionPoints;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", STR=" + STR +
                ", DEX=" + DEX +
                ", INT=" + INT +
                ", CON=" + CON +
                ", inventory=" + inventory +
                ", offense=" + offense +
                ", defense=" + defense +
                ", healthPoints=" + healthPoints +
                ", actionPoints=" + actionPoints +
                ", turnActionPoints=" + turnActionPoints +
                '}';
    }

    @Override
    public void attack(Hero other) {

    }
}
