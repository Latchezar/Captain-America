package Items;

import Creatures.HeroClass;
import Creatures.Stats;

public class Weapon extends ItemType
{
    private int minDamage;
    private int maxDamage;

    public Weapon(int requiredLevel, HeroClass requiredClass, Stats stats, int minDamage, int maxDamage)
    {
        super(requiredLevel, requiredClass, stats);
        setMinDamage(minDamage);
        setMaxDamage(maxDamage);
    }

    public int getMinDamage()
    {
        return minDamage;
    }

    public int getMaxDamage()
    {
        return maxDamage;
    }

    private void setMinDamage(int minDamage)
    {
        this.minDamage = minDamage;
    }

    private void setMaxDamage(int maxDamage)
    {
        this.maxDamage = maxDamage;
    }
}
