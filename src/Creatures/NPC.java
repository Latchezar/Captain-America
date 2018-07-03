package Creatures;

import Items.Item;

public class NPC extends Creature
{
    private Item loot;
    private NPSType type;

    public NPC(String name, int currentLevel, Item loot)
    {
        super(name, currentLevel);
        setLoot(loot);

    }

    public Item getLoot()
    {
        return loot;
    }

    public void setLoot(Item loot)
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

    public void setType(NPSType type) {
        this.type = type;
    }
}
