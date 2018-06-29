package Items;

import Creatures.HeroClass;
import Creatures.Stats;

public class Weapon extends Item
{
    private WeaponType weaponType;
    private WeaponStats weaponStats;

    public Weapon(String name, int requiredLevel, HeroClass heroClass, WeaponType weaponType, Stats itemStats, WeaponStats weaponStats)
    {
        super(name, requiredLevel, heroClass, itemStats);
        setWeaponType(weaponType);
        setWeaponStats(weaponStats);
    }

    public WeaponType getWeaponType()
    {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType)
    {
        this.weaponType = weaponType;
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
