package Items;

import Creatures.HeroClass;
import Creatures.Stats;

public abstract class Item
{
    private String itemName;
    private int itemLevel;
    private HeroClass heroClass;
    private Stats itemStats;
    private ItemType itemType;

    public Item (String name, int requiredLevel, HeroClass heroClass, Stats itemStats, ItemType itemType)
    {
        setItemName(name);
        setItemLevel(requiredLevel);
        setHeroClass(heroClass);
        setItemStats(itemStats);
    }

    public abstract ArmourType getItemType();

    public String getItemName()
    {
        return itemName;
    }

    private void setItemName(String itemName)
    {
        this.itemName = itemName;
    }

    public int getItemLevel()
    {
        return itemLevel;
    }

    public void setItemLevel(int itemLevel)
    {
        this.itemLevel = itemLevel;
    }

    public HeroClass getHeroClass()
    {
        return heroClass;
    }

    public void setHeroClass(HeroClass heroClass)
    {
        this.heroClass = heroClass;
    }

    public Stats getItemStats()
    {
        return itemStats;
    }

    public void setItemStats(Stats itemStats)
    {
        this.itemStats = itemStats;
    }
}
