package Creatures;

import Powers.Power;

import java.util.ArrayList;

public abstract class Hero extends Creature {
    private final int MAX_LVL = 10;
    private Race race;
    private int currentXP = 1;
    ArrayList<Power> currentPowers;

    {
        currentPowers = new ArrayList<>();
    }

    public Hero(String name, Race race) {
        super(name, 1);
        setRace(race);
    }


    public int getCurrentXP() {
        return currentXP;
    }

    void addHeroPower(Power power){
        currentPowers.add(power);
    }

    public Race getRace() {
        return race;
    }

    public int getMAX_LVL() {
        return MAX_LVL;
    }

    public void setRace(Race race) {
        this.race = race;
    }
}
