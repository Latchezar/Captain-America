package Items;

import Creatures.Stats;

public class WeaponStats extends Stats
{
    private int minDamage;
    private int maxDamage;

    public WeaponStats(int minDamage, int maxDamage)
    {
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
