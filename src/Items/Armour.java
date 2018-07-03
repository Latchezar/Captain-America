package Items;

import Creatures.HeroClass;
import Creatures.Stats;

public class Armour extends Item
{
    private ArmourType itemType;
    private Stats itemStats;

    public Armour(String name, int requiredLevel, HeroClass heroClass, Stats itemStats, ArmourType armourType)
    {
        super(name, requiredLevel, heroClass, itemStats);
        setItemType(armourType);
    }

    public ArmourType getItemType()
    {
        return itemType;
    }

    public void setItemType(ArmourType armourType)
    {
        this.itemType = armourType;
    }

    @Override
    public Stats getItemStats() {
        return itemStats;
    }

    @Override
    public void setItemStats(Stats itemStats) {
        this.itemStats = itemStats;
    }
}
