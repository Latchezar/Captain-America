package Creatures;

import Items.*;
import Powers.HeroPower;
import Powers.PowerType;
import UiFeatures.Assets;
import UiFeatures.NameTooLong;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Paladin extends Hero implements Attackable {

    private Stats heroStats;
    private int maxHealth;


    public Paladin(String name, Race race, float x, float y) throws NameTooLong {
        super(name, race, x , y);
        heroStats = new Stats(race, 2, 2, 2); //those are magical numbers :D
        setMaxHealth(this.heroStats.getStamina() * 10 + 1 * 10);
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
                    if (mask.getType() == WeaponType.HAMMER) {
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

    @Override
    public void setImage(){
        switch (this.getRace()){
            case DWARF:
                image = Assets.dwarfPaladin;
                break;
            case HUMAN:
                image = Assets.humanPaladin;
                break;
            case ELF:
                image = Assets.elfPaladin;
                break;
            case ORC:
                image = Assets.orcPaladin;
                break;
            case TROLL:
                image = Assets.trollPaladin;
                break;
            case UNDEAD:
                image = Assets.undeadPaladin;
        }
    }
    // UI

    @Override
    public void update(){

    }

}
