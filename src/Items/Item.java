package Items;

import Creatures.HeroClass;

public abstract class Item
{
    private String itemName;
    private int requiredLevel;
    HeroClass heroClass;

    public Item (String name, int requiredLevel, HeroClass heroClass)
    {
        setItemName(name);
        setRequiredLevel(requiredLevel);
        this.heroClass = heroClass;
    }

    public String getItemName()
    {
        return itemName;
    }

    private void setItemName(String itemName)
    {
        this.itemName = itemName;
    }

    public int getRequiredLevel()
    {
        return requiredLevel;
    }

    public void setRequiredLevel(int requiredLevel)
    {
        this.requiredLevel = requiredLevel;
    }
}
