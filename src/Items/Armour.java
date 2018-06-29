package Items;

import Creatures.HeroClass;

public class Armour extends Item
{
    private ArmourType armourType;

    public Armour(String name, int requiredLevel, HeroClass heroClass, ArmourType armourType)
    {
        super(name, requiredLevel, heroClass);
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
