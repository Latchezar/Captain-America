package Creatures;

import Items.Armour;
import Items.Item;
import Items.Weapon;
import Powers.Power;
import UiFeatures.NameTooLong;

import java.awt.*;
import java.util.ArrayList;

public abstract class Hero extends Creature {
    private final int MAX_LVL = 10;
    private Race race;
    protected int currentXP = 1;
    private ArrayList<Power> currentPowers;
    private Weapon weapon;
    private Armour helmet;
    private Armour chest;
    private Armour boots;

    {
        currentPowers = new ArrayList<>();
    }

    public Hero(String name, Race race, float x, float y) throws NameTooLong {
        super(name, 1, x, y, Creature.DEFAULT_WIDTH, Creature.DEFAULT_HEIGHT);
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

    protected void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    protected Item getChest() {
        return chest;
    }

    protected void setChest(Armour chest) {
        this.chest = chest;
    }

    protected Item getHelmet() {
        return helmet;
    }

    protected Item getBoots() {
        return boots;
    }

    protected void setBoots(Armour boots) {
        this.boots = boots;
    }

    protected void setHelmet(Armour helmet) {
        this.helmet = helmet;
    }

}
