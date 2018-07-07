package Creatures;

import Items.Armour;
import Items.Item;
import Items.Weapon;
import Powers.Power;

import java.awt.*;
import java.util.ArrayList;

public abstract class Hero extends Creature {
    private final int MAX_LVL = 10;
    private Race race;
    protected int currentXP = 1;
    private ArrayList<Power> currentPowers;
    private Weapon weapon;
    private Item helmet;
    private Item chest;
    private Item leggings;
    private ArrayList<Armour> items;

    {
        currentPowers = new ArrayList<>();
    }

    public Hero(String name, Race race, float x, float y) {
        super(name, 1, x, y, Creature.DEFAULT_WIDTH, Creature.DEFAULT_HEIGTH);
        setRace(race);
    }


    protected int getCurrentXP() {
        return currentXP;
    }

    protected void addHeroPower(Power power){
        currentPowers.add(power);
    }

    protected Race getRace() {
        return race;
    }

    protected int getMAX_LVL() {
        return MAX_LVL;
    }

    protected void setRace(Race race) {
        this.race = race;
    }

    protected ArrayList<Power> getCurrentPowers(){
        return currentPowers;
    }

    protected Weapon getWeapon() {
        return weapon;
    }

    protected ArrayList<Armour> getItems() {
        return items;
    }

    protected void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    protected Item getChest() {
        return chest;
    }

    protected void setChest(Item chest) {
        this.chest = chest;
    }

    protected Item getHelmet() {
        return helmet;
    }

    protected Item getLeggings() {
        return leggings;
    }

    protected void setLeggings(Item leggings) {
        this.leggings = leggings;
    }

    protected void setHelmet(Item helmet) {
        this.helmet = helmet;
    }

}
