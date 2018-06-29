package Items;

import Creatures.Stats;

public class WeaponStats extends ItemStats
{
    private int minDamage;
    private int maxDamage;

    public WeaponStats(Stats stats, int minDamage, int maxDamage)
    {
        super(stats);
        setMinDamage(minDamage);
        setMaxDamage(maxDamage);
    }

    public int getMinDamage()
    {
        return minDamage;
    }

    public void setMinDamage(int minDamage)
    {
        this.minDamage = minDamage;
    }

    public int getMaxDamage()
    {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage)
    {
        this.maxDamage = maxDamage;
    }
}
