package Creatures;

import Powers.HeroPower;
import Powers.PowerType;

public class Warrior extends Hero implements Attackable {
    private Stats heroStats;
    private int maxHealth;


    Warrior(String name, Race race){
        super(name, race);
        setHeroStats(race, 2, 2, 1); //those are magical numbers :D
        setMaxHealth(this.heroStats.getStamina()*10+1*10);
        this.setCurrenHealth(maxHealth);
    }

    public int getMaxHealth() {
        return maxHealth;
    }
    public void useAbility(){
        //to use some power
    }

    private int deffHealth(){
        int health = 1*10 + (this.getHeroStats().getStamina() * 10);

        return 1;
    }
    private Stats setHeroStats(Race race, int stamina, int power, int deffence) {
        switch (race) {
            case HUMAN:
                stamina += 1;
                power += 2;
                deffence += 1;
                break;
            case ORC:
                stamina += 2;
                power += 1;
                deffence += 1;
                break;
            case UNDEAD:
                stamina += 2;
                power += 2;
                break;
            case ELF:
                stamina += 2;
                power += 2;
                break;
            case TROLL:
                power += 3;
                deffence += 1;
                break;
            case DWARF:
                stamina+=2;
                power+=1;
                deffence+=1;
                break;
        }
        return new Stats(stamina, power, deffence);
    }

    public Stats getHeroStats() {
        return heroStats;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    void addPower() {
        if (this.getCurrentLvl() == 3) {
            HeroPower mortalStrike = new HeroPower("Mortal Strike", PowerType.MELEE, 10, 3, HeroClass.WARRIOR);
            addHeroPower(mortalStrike);
            return;
        }
        if (this.getCurrentLvl() == 5) {
            HeroPower overpower = new HeroPower("Overpower", PowerType.MELEE, 33, 5, HeroClass.WARRIOR);
            addHeroPower(overpower);
            return;
        }
        if (this.getCurrentLvl() == 7) {
            HeroPower rampage = new HeroPower("Rampage", PowerType.MELEE, 77, 7, HeroClass.WARRIOR);
            addHeroPower(rampage);
            return;
        }
        if (this.getCurrentLvl() == 10) {
            HeroPower bladestorm = new HeroPower("Bladestorm", PowerType.MELEE, 100, 10, HeroClass.WARRIOR);
            addHeroPower(bladestorm);
            return;
        }
    }
}
