package Creatures;

import Items.*;
import Powers.HeroPower;
import Powers.Power;
import Powers.PowerType;
import UiFeatures.Assets;
import UiFeatures.ImageLoader;
import UiFeatures.NameTooLong;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Hunter extends Hero implements Attackable {
    private Stats heroStats;
    private int maxHealth;


    public Hunter(String name, Race race, float x, float y) throws NameTooLong {
        super(name, race, x , y);
        heroStats = new Stats(race, 1, 3, 1); //those are magical numbers :D
        setMaxHealth();
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
