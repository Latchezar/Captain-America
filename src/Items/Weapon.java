package Items;

public class Weapon extends ItemType
{
    private int minDamage;
    private int maxDamage;

    public Weapon(int requiredLevel, int minDamage, int maxDamage)
    {
        super(requiredLevel);
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

    public void setMinDamage(int minDamage)
    {
        this.minDamage = minDamage;
    }

    public void setMaxDamage(int maxDamage)
    {
        this.maxDamage = maxDamage;
    }
}
