package Items;

import Creatures.HeroClass;

public class Weapon extends Item
{
    private WeaponType weaponType;
    private WeaponStats weaponStats;

    public Weapon(String name, int requiredLevel, HeroClass heroClass, WeaponType weaponType)
    {
        super(name, requiredLevel, heroClass);
        setWeaponType(weaponType);
    }

    public WeaponType getWeaponType()
    {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType)
    {
        this.weaponType = weaponType;
    }
}
