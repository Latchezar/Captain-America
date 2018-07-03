package Creatures;

import Powers.HeroPower;
import Powers.Power;
import Powers.PowerType;

public class Hunter extends Hero implements Attackable {
    private Stats heroStats;
    private int maxHealth;


    Hunter(String name, Race race){
        super(name, race);
        setHeroStats(race, 1, 3, 1); //those are magical numbers :D
        setMaxHealth();
        this.setCurrenHealth(maxHealth);
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    @Override
    public void useAbility(int index, NPC attacked){

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

    public void setMaxHealth() {
        this.maxHealth = this.heroStats.getStamina()*10+this.getCurrentLvl()*10;
    }

    void addPower() {
        if (this.getCurrentLvl() == 3) {
            Power arcaneShot = new HeroPower("Arcane Shot", PowerType.RANGED,10,3,HeroClass.HUNTER);
            addHeroPower(arcaneShot);
            return;
        }
        if (this.getCurrentLvl() == 5) {
            Power multiShot = new HeroPower("Multi Shot", PowerType.RANGED, 50, 5, HeroClass.HUNTER);
            addHeroPower(multiShot);
            return;
        }
        if (this.getCurrentLvl() == 7) {
            Power ViperString= new HeroPower("Viper String", PowerType.RANGED, 75, 7, HeroClass.HUNTER);
            addHeroPower(ViperString);
            return;
        }
        if (this.getCurrentLvl() == 10) {
            Power serpentString = new HeroPower("Serpent String", PowerType.RANGED, 100, 10, HeroClass.HUNTER);
            addHeroPower(serpentString);
            return;
        }
    }
}
