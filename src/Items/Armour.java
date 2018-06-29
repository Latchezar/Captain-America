package Items;

import Creatures.HeroClass;
import Creatures.Stats;

public class Armour extends Item
{
    private ArmourType armourType;

    public Armour(String name, int requiredLevel, HeroClass heroClass, Stats itemStats, ArmourType armourType)
    {
        super(name, requiredLevel, heroClass, itemStats);
        setArmourType(armourType);
    }

    public ArmourType getArmourType()
    {
        return armourType;
    }

    public void setArmourType(ArmourType armourType)
    {
        this.armourType = armourType;
    }
}
