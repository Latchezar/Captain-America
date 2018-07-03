package Items;

import Creatures.HeroClass;
import Creatures.Stats;

public class Weapon extends Item
{
    private WeaponStats weaponStats;

    public Weapon(String name, int requiredLevel, HeroClass heroClass, WeaponType weaponType, Stats itemStats, WeaponStats weaponStats)
    {
        super(name, requiredLevel, heroClass, itemStats);
        setItemType(weaponType);
        setWeaponStats(weaponStats);
    }

    @Override
    public WeaponType getItemType()
    {
        return itemType;
    }

    public void setItemType(WeaponType weaponType)
    {
        this.itemType = weaponType;
    }

    public WeaponStats getWeaponStats()
    {
        return weaponStats;
    }

    public void setWeaponStats(WeaponStats weaponStats)
    {
        this.weaponStats = weaponStats;
    }
}
