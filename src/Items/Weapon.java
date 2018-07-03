package Items;

import Creatures.HeroClass;
import Creatures.Stats;

public class Weapon extends Item
{
    private WeaponStats weaponStats;

    public Weapon(String name, int itemLevel, int minDamage, int maxDamage)
    {
        super(name, itemLevel, ItemType.WEAPON);
        setWeaponStats(minDamage, maxDamage);
    }

    public WeaponStats getWeaponStats()
    {
        return weaponStats;
    }

    public void setWeaponStats(int minDamage, int maxDamage)
    {
        this.weaponStats = new WeaponStats(minDamage, maxDamage);
    }
}
