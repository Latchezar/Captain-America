package Creatures;

import Items.*;
import Powers.HeroPower;
import Powers.PowerType;
import UiFeatures.Assets;
import UiFeatures.NameTooLong;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

public class Mage extends Hero implements Attackable {
    private Stats heroStats;
    private int maxHealth;


    public Mage(String name, Race race, float x, float y) throws NameTooLong {
        super(name, race, x , y);
        heroStats = new Stats(race, 1, 4, 0);
        setMaxHealth(heroStats.getStamina()*10+getCurrentLvl()*10);
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
        //the attack
        int returnedDamaged = attacked.receiveAttack(damage);
        // check if dead
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


    private int newHealth(){
        int health = this.getCurrentLvl()*10 + (this.getHeroStats().getStamina() * 10);

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

    @Override
    public void setImage(){
        switch (this.getRace()){
            case DWARF:
                image = Assets.dwarfMage;
                break;
            case HUMAN:
                image = Assets.humanMage;
                break;
            case ELF:
                image = Assets.elfMage;
                break;
            case ORC:
                image = Assets.orcMage;
                break;
            case TROLL:
                image = Assets.trollMage;
                break;
            case UNDEAD:
                image = Assets.undeadMage;
        }
    }

    // UI

    @Override
    public void update(){

    }

}
