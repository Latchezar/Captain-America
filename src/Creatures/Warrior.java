package Creatures;

import Items.*;
import Powers.HeroPower;
import Powers.PowerType;
import UiFeatures.Assets;
import UiFeatures.NameTooLong;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Map;
import java.util.Random;

public class Warrior extends Hero implements Attackable {
    private Stats heroStats;
    private int maxHealth;


    public Warrior(String name, Race race, float x, float y) throws NameTooLong {
        super(name, race, x , y);
        heroStats = new Stats(race, 2, 2, 1); //those are magical numbers :D
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
                    if (mask.getType() == WeaponType.SWORD) {
                        if (this.getWeapon() == null) {
                            this.setWeapon(mask);
                        } else {
                            if (this.getWeapon().getItemLevel() < dropped.getItemLevel()) {
                                this.setWeapon(mask);
                            }
                        }
                    }
                } else if (dropped.getItemType() == ItemType.ARMOUR){
                    Armour armor = (Armour) dropped;
                    if (armor.getType() == ArmourType.CHEST) {
                        if (this.getChest() == null) {
                            this.setChest(armor);
                        } else {
                            if (this.getChest().getItemLevel() < dropped.getItemLevel()) {
                                this.setChest(armor);
                            }
                        }
                    } else if (armor.getType() == ArmourType.HELMET) {
                        if (this.getHelmet() == null) {
                            this.setHelmet(armor);
                        } else if (this.getHelmet().getItemLevel() < dropped.getItemLevel()) {
                            this.setHelmet(armor);
                        }
                    } else if (armor.getType() == ArmourType.BOOTS) {
                        if (this.getBoots() == null) {
                            this.setBoots(armor);
                        } else if (this.getBoots().getItemLevel() < dropped.getItemLevel()) {
                            this.setBoots(armor);
                        }
                    }
                }
            }
            // end with item switch

        }
    }
    private int newHealth(){
        int health = maxHealth*10 + (this.getHeroStats().getStamina() * 10);

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
    @Override
    public void setImage(){
        switch (this.getRace()){
            case DWARF:
                image = Assets.dwarfWarrior;
                break;
            case HUMAN:
                image = Assets.humanWarrior;
                break;
            case ELF:
                image = Assets.elfWarrior;
                break;
            case ORC:
                image = Assets.orcWarrior;
                break;
            case TROLL:
                image = Assets.trollWarrior;
                break;
            case UNDEAD:
                image = Assets.undeadWarrior;
        }
    }

    // UI

    @Override
    public void update(){

    }
}
