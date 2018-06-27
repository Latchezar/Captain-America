package Items;

public class Weapon extends ItemType
{
    private int minDamage;
    private int maxDamage;

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
