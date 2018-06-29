package Items;

import Creatures.HeroClass;

public class Weapon extends Item
{
    private WeaponType weaponType;
    private WeaponStats weaponStats;

    public Weapon(String name, int requiredLevel, HeroClass heroClass)
    {
        super(name, requiredLevel, heroClass);
    }
}
