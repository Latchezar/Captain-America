package Creatures;

import Items.Item;
import Items.ItemType;
import Items.Weapon;
import Items.WeaponType;
import Powers.HeroPower;
import Powers.PowerType;
import UiFeatures.Assets;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Paladin extends Hero implements Attackable {

    private Stats heroStats;
    private int maxHealth;


    Paladin(String name, Race race, float x, float y){
        super(name, race, x , y);
        setHeroStats(race, 2, 2, 2); //those are magical numbers :D
        setMaxHealth(this.heroStats.getStamina() * 10 + 1 * 10);
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
                    } else if (dropped.getItemType() == ItemType.LEGGINGS) {
                        if (this.getLeggings() == null) {
                            this.setLeggings(dropped);
                        } else if (this.getLeggings().getItemLevel() < dropped.getItemLevel()) {
                            this.setLeggings(dropped);
                        }
                    }
                }
            }
            // end with item switch

        }
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
