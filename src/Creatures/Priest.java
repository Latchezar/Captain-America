package Creatures;

import Powers.HeroPower;
import Powers.Power;
import Powers.PowerType;

import java.nio.channels.Pipe;

public class Priest extends Hero implements HeroAbilities {
    private Stats heroStats;
    private int maxHealth;


    Priest(String name, Race race){
        super(name, race);
        setHeroStats(race, 1, 4, 1); //those are magical numbers :D
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
            Power smite = new HeroPower("Smite", PowerType.MAGIC, 5, 3, HeroClass.PRIEST);
            addHeroPower(smite);
            return;
        }
        if (this.getCurrentLvl() == 5) {
            Power shadowWord = new HeroPower("Shadow Word", PowerType.MAGIC, 20,5, HeroClass.PRIEST);
            addHeroPower(shadowWord);
            return;
        }
        if (this.getCurrentLvl() == 7) {
            Power holyFire = new HeroPower("Holy Fire", PowerType.MAGIC, 45,7, HeroClass.PRIEST);
            addHeroPower(holyFire);
            return;
        }
        if (this.getCurrentLvl() == 10) {
            Power vampireTouch = new HeroPower("Vampire Touch", PowerType.MAGIC, 100,10, HeroClass.PRIEST);
            addHeroPower(vampireTouch);
            return;
        }
    }
}
