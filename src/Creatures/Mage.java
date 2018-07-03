package Creatures;

import Powers.HeroPower;
import Powers.PowerType;

import java.util.Random;

public class Mage extends Hero implements Attackable {
    private Stats heroStats;
    private int maxHealth;


    Mage(String name, Race race){
        super(name, race);
        setHeroStats(race, 1, 4, 0);
        setMaxHealth(this.heroStats.getStamina()*10+1*10);
        this.setCurrenHealth(maxHealth);
    }
    public int getMaxHealth() {
        return maxHealth;
    }

    @Override
    public void useAbility(int index, NPC attacked){
        int damage = 0;
        if (this.getWeapon() == null) {
            damage = heroStats.getPower() + this.getCurrentPowers().get(index).getBaseDamage();
        } else {
            Random mask = new Random();
            int weaponDamage = mask.nextInt(this.getWeapon().getWeaponStats().getMaxDamage())+this.getWeapon().getWeaponStats().getMinDamage();
            damage = heroStats.getPower()  + weaponDamage + this.getCurrentPowers().get(index).getBaseDamage();
        }
        attacked.
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
            HeroPower arcaneMissiles = new HeroPower("Arcane Missiles", PowerType.MAGIC, 15, 3, HeroClass.MAGE);
            addHeroPower(arcaneMissiles);
            return;
        }
        if (this.getCurrentLvl() == 5) {
            HeroPower pyroblast = new HeroPower("Pyroblast", PowerType.MAGIC, 40, 5, HeroClass.MAGE);
            addHeroPower(pyroblast);
            return;
        }
        if (this.getCurrentLvl() == 7) {
            HeroPower glacialSpike = new HeroPower("Glacial Spike", PowerType.MAGIC, 80, 7, HeroClass.MAGE);
            addHeroPower(glacialSpike);
            return;
        }
        if (this.getCurrentLvl() == 10) {
            HeroPower livingBomb = new HeroPower("Living Bomb", PowerType.MAGIC, 110, 10, HeroClass.MAGE);
            addHeroPower(livingBomb);
            return;
        }
    }
}
