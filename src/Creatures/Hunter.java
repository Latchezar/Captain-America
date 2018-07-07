package Creatures;

import Items.Item;
import Items.ItemType;
import Items.Weapon;
import Items.WeaponType;
import Powers.HeroPower;
import Powers.Power;
import Powers.PowerType;
import UiFeatures.Assets;
import UiFeatures.ImageLoader;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Hunter extends Hero implements Attackable {
    private Stats heroStats;
    private int maxHealth;


    Hunter(String name, Race race, float x, float y){
        super(name, race, x , y);
        setHeroStats(race, 1, 3, 1); //those are magical numbers :D
        setMaxHealth();
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
                    if (mask.getType() == WeaponType.BOW) {
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
            Power ViperString= new HeroPower("Viper Sting", PowerType.RANGED, 75, 7, HeroClass.HUNTER);
            addHeroPower(ViperString);
            return;
        }
        if (this.getCurrentLvl() == 10) {
            Power serpentString = new HeroPower("Serpent Sting", PowerType.RANGED, 100, 10, HeroClass.HUNTER);
            addHeroPower(serpentString);
            return;
        }
    }


    @Override
    public void setImage(){
        switch (this.getRace()){
            case DWARF:
                image = Assets.dwarfHunter;
                break;
            case HUMAN:
                image = Assets.humanHunter;
                break;
            case ELF:
                image = Assets.elfHunter;
                break;
            case ORC:
                image = Assets.orcHunter;
                break;
            case TROLL:
                image = Assets.trollHunter;
                break;
            case UNDEAD:
                image = Assets.undeadHunter;
        }
    }

    // UI

    @Override
    public void update(){

    }

}
