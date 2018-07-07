package Creatures;

import Items.Item;
import UiFeatures.Assets;

import java.awt.*;
import java.util.ArrayList;

public class NPC extends Creature
{
    private ArrayList<Item> loot;
    private NPCType type;

    public NPC(String name, int currentLevel, NPCType type, ArrayList<Item> loot, float x, float y)
    {
        super(name, currentLevel, x, y, DEFAULT_WIDTH, DEFAULT_HEIGTH);
        setLoot(loot);
        setType(type);

    }

    public ArrayList<Item> getLoot()
    {
        return loot;
    }

    public void setLoot(ArrayList<Item> loot)
    {
        this.loot = loot;
    }

    public int receiveAttack(int damage)
    {
        int life = getCurrenHealth() - damage;

        if (life <= 0)
        {
            return 0;
        }
        int damageToReturn = getDamage() * this.getCurrentLvl();
        return damageToReturn;
    }


    private int getDamage(){
        switch (type){
            case UNDEAD:
                return 2;
            case DEMON:
                return 4;
            case ANIMAL:
                return 2;
            case HUMANOID:
                return 3;
        }
        return -1;
    }

    public void setType(NPCType type) {
        this.type = type;
    }

    @Override
    public void update() {

    }

    @Override
    public void setImage(){
        switch (getCurrentLvl()){
            case 1:
                if (type.equals(NPCType.MOB)){
                    image = Assets.oneMob;
                } else {image = Assets.oneBoss;}
            break;
            case 2:
                if (type.equals(NPCType.BOSS)){
                    image = Assets.twoBoss;
                } else {image = Assets.twoMob;}
                break;
            case 3:
                if (type.equals(NPCType.MOB)){
                    image = Assets.threeBoss;
                } else {image = Assets.threeBoss;}
                break;
            case 4:
                if (type.equals(NPCType.MOB)){
                    image = Assets.fourMob;
                } else {image = Assets.fourBoss;}
                break;
            case 5:
                if (type.equals(NPCType.MOB)){
                    image = Assets.fiveMob;
                } else {image = Assets.fiveBoss;}
                break;
            case 6:
                if (type.equals(NPCType.MOB)){
                    image = Assets.sixMob;
                } else {image = Assets.sixBoss;}
                break;
            case 7:
                if (type.equals(NPCType.MOB)){
                    image = Assets.sevenMob;
                } else {image = Assets.sevenBoss;}
                break;
            case 8:
                if (type.equals(NPCType.MOB)){
                    image = Assets.eightMob;
                } else {image = Assets.eightBoss;}
                break;
            case 9:
                if (type.equals(NPCType.MOB)){
                    image = Assets.nineMob;
                } else {image = Assets.nineBoss;}
                break;
            case 10:
                if (type.equals(NPCType.MOB)){
                    image = Assets.tenMob;
                } else {image = Assets.tenBoss;}
                break;
        }
    }
}
