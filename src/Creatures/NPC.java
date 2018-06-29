package Creatures;

import Items.Item;

public class NPC extends Creature
{
    private Item loot;
    private int expDrop;

    public NPC(String name, int currentLvL, int currenHealth, Item loot, int expDrop)
    {
        super(name, currentLvL, currenHealth);
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
}
