package Creatures;

import Items.*;
import Powers.HeroPower;
import Powers.Power;
import Powers.PowerType;
import UiFeatures.Assets;
import UiFeatures.NameTooLong;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.nio.channels.Pipe;
import java.util.Random;

public class Priest extends Hero implements Attackable {
    private Stats heroStats;
    private int maxHealth;


    public Priest(String name, Race race, float x, float y) throws NameTooLong {
        super(name, race, x , y);
        heroStats = new Stats(race, 1, 4, 1); //those are magical numbers :D
        setMaxHealth(this.heroStats.getStamina()*10+1*10);
        this.setCurrentHealth(maxHealth);
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

                maxHealth = newHealth();
                this.addPower();
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
                    Armour mask = (Armour) dropped;
                    if (mask.getType() == ArmourType.CHEST) {
                        if (this.getChest() == null) {
                            this.setChest(mask);
                        } else {
                            if (this.getChest().getItemLevel() < dropped.getItemLevel()) {
                                this.setChest(mask);
                            }
                        }
                    } else if (mask.getType() == ArmourType.HELMET) {
                        if (this.getHelmet() == null) {
                            this.setHelmet(mask);
                        } else if (this.getHelmet().getItemLevel() < dropped.getItemLevel()) {
                            this.setHelmet(mask);
                        }
                    } else if (mask.getType() == ArmourType.BOOTS) {
                        if (this.getBoots() == null) {
                            this.setBoots(mask);
                        } else if (this.getBoots().getItemLevel() < dropped.getItemLevel()) {
                            this.setBoots(mask);
                        }
                    }
                }
            }
            // end with item switch

        }
    }

    private int newHealth() {
        int health = getMaxHealth() * 10 + (this.getHeroStats().getStamina() * 10);

        return health;
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
    @Override
    public void setImage(){
        switch (this.getRace()){
            case DWARF:
                image = Assets.dwarfPriest;
                break;
            case HUMAN:
                image = Assets.humanPriest;
                break;
            case ELF:
                image = Assets.elfPriest;
                break;
            case ORC:
                image = Assets.orcPriest;
                break;
            case TROLL:
                image = Assets.trollPriest;
                break;
            case UNDEAD:
                image = Assets.undeadPriest;
        }
    }
    // UI

    @Override
    public void update(){

    }

}
