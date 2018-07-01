package Creatures;

import Powers.HeroPower;
import Powers.Power;
import Powers.PowerType;

public class Paladin extends Hero implements HeroAbilities {

    private Stats heroStats;
    private int maxHealth;


    Paladin(String name, Race race) {
        super(name, race);
        setHeroStats(race, 2, 2, 2); //those are magical numbers :D
        setMaxHealth(this.heroStats.getStamina() * 10 + 1 * 10);
        this.setCurrenHealth(maxHealth);
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void useAbility() {
        //to use some power
    }

    private int deffHealth() {
        int health = 1 * 10 + (this.getHeroStats().getStamina() * 10);

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
                stamina += 2;
                power += 1;
                deffence += 1;
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
            HeroPower hammerOfWrath = new HeroPower("Hammer Of Wrath", PowerType.MELEE, 8, 3, HeroClass.PALADIN);
            addHeroPower(hammerOfWrath);
            return;
        }
        if (this.getCurrentLvl() == 5) {
            HeroPower holyLight = new HeroPower("Holy Light", PowerType.HEAL, 20, 5, HeroClass.PALADIN);
            addHeroPower(holyLight);
            return;
        }
        if (this.getCurrentLvl() == 7) {
            HeroPower crusaderStrike = new HeroPower("Crusader Strike", PowerType.MELEE, 67, 7, HeroClass.PALADIN);
            addHeroPower(crusaderStrike);
            return;
        }
        if (this.getCurrentLvl() == 10) {
            HeroPower divineStorm = new HeroPower("Divine Storm", PowerType.MAGIC, 95, 10, HeroClass.PALADIN);
            addHeroPower(divineStorm);
            return;
        }
    }
}
