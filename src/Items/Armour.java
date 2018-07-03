package Items;

import Creatures.HeroClass;
import Creatures.Stats;

public class Armour extends Item
{
    private ArmourType itemType;

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
}
