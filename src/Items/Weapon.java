package Items;

import Creatures.HeroClass;
import Creatures.Stats;

public class Weapon extends Item
{
    private int minDamage;
    private int maxDamage;

    public Weapon(String name, int itemLevel, int minDamage, int maxDamage)
    {
        super(name, itemLevel, ItemType.WEAPON);
        setMinDamage(minDamage);
        setMaxDamage(maxDamage);
    }


    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public void setMinDamage(int minDamage) {
        this.minDamage = minDamage;
    }
}
