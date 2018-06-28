package Items;

import Creatures.HeroClass;
import Creatures.Stats;

public abstract class ItemType
{
    private int requiredLevel;
    private HeroClass requiredClass;
    private Stats stats;

    public ItemType(int requiredLevel, HeroClass requiredClass, Stats stats)
    {
        setRequiredLevel(requiredLevel);
        setRequiredClass(requiredClass);
    }

    public int getRequiredLevel()
    {
        return requiredLevel;
    }

    private void setRequiredLevel(int requiredLevel)
    {
        this.requiredLevel = requiredLevel;
    }

    public HeroClass getRequiredClass()
    {
        return requiredClass;
    }

    private void setRequiredClass(HeroClass requiredClass)
    {
        this.requiredClass = requiredClass;
    }
}
