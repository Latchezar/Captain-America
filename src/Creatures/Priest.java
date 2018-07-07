package Creatures;

import Items.Item;
import Items.ItemType;
import Items.Weapon;
import Items.WeaponType;
import Powers.HeroPower;
import Powers.Power;
import Powers.PowerType;

import java.nio.channels.Pipe;
import java.util.Random;

public class Priest extends Hero implements Attackable {
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
    @Override
    public void useAbility(int index, NPC attacked) {
        int damage = 0;
        if (this.getWeapon() == null) {
            damage = heroStats.getPower() + this.getCurrentPowers().get(index).getBaseDamage();
        } else {
            Random rand = new Random();
            int min_damage = this.getWeapon().getMinDamage();
            int max_damage = this.getWeapon().getMaxDamage();

            int weaponDamage = rand.nextInt((max_damage - min_damage) + 1) + min_damage;
            damage = heroStats.getPower() + weaponDamage + this.getCurrentPowers().get(index).getBaseDamage();
        }
        int returnedDamaged = attacked.receiveAttack(damage);
        if (returnedDamaged == 0) {
            //ma toi umrql ma
            if (this.getCurrentLvl() - 1 <= currentXP / 10) {
                this.setCurrentLvl(this.getCurrentLvl() + 1);
            }

            // item switch start
            for (Item dropped :
                    attacked.getLoot()) {

                if (dropped.getItemType() == ItemType.WEAPON) {
                    Weapon mask = (Weapon) dropped;
                    if (mask.getType() == WeaponType.STAFF) {
                        if (this.getWeapon() == null) {
                            this.setWeapon(mask);
                        } else {
                            if (this.getWeapon().getItemLevel() < dropped.getItemLevel()) {
                                this.setWeapon(mask);
                            }
                        }
                    }
                } else {
                    if (dropped.getItemType() == ItemType.CHEST) {
                        if (this.getChest() == null) {
                            this.setChest(dropped);
                        } else {
                            if (this.getChest().getItemLevel() < dropped.getItemLevel()) {
                                this.setChest(dropped);
                            }
                        }
                    } else if (dropped.getItemType() == ItemType.HELMET) {
                        if (this.getHelmet() == null) {
                            this.setHelmet(dropped);
                        } else if (this.getHelmet().getItemLevel() < dropped.getItemLevel()) {
                            this.setHelmet(dropped);
                        }
                    } else if (dropped.getItemType() == ItemType.BOOTS) {
                        if (this.getBoots() == null) {
                            this.setBoots(dropped);
                        } else if (this.getBoots().getItemLevel() < dropped.getItemLevel()) {
                            this.setBoots(dropped);
                        }
                    }
                }
            }
            // end with item switch

        }
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
