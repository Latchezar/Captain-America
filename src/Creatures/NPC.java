package Creatures;

import Items.Item;

public class NPC extends Creature
{
    private Item loot;
    private int expDrop;

    public NPC(String name, int currentLevel, Item loot, int expDrop)
    {
        super(name, currentLevel);
        setLoot(loot);
        setExpDrop(expDrop);
    }

    public Item getLoot()
    {
        return loot;
    }

    public void setLoot(Item loot)
    {
        this.loot = loot;
    }

    public int getExpDrop()
    {
        return expDrop;
    }

    public void setExpDrop(int expDrop)
    {
        this.expDrop = expDrop;
    }

    public int receiveAttack(int damage)
    {
        int life = getCurrenHealth() - damage;

        if (life <= 0)
        {
            return 0;
        }
        return 1;
    }
}
