package Items;

import Creatures.HeroClass;
import Creatures.Stats;

public class Weapon extends Item
{
    private int minDamage;
    private int maxDamage;
    private WeaponType type;

    public Weapon(String name, int itemLevel, int minDamage, int maxDamage, WeaponType type)
    {
        super(name, itemLevel, ItemType.WEAPON);
        setMinDamage(minDamage);
        setMaxDamage(maxDamage);
        setType(type);
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

    public WeaponType getType()
    {
        return type;
    }

    public void setType(WeaponType type)
    {
        this.type = type;
    }
}
