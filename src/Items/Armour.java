package Items;

import Creatures.Stats;

public class Armour extends Item
{
    private Stats itemStats;
    private ArmourType type;

    public Armour(String name, int itemLevel, int stamina, int power, int deffence, ArmourType type)
    {
        super(name, itemLevel, ItemType.ARMOUR);
        setItemStats(stamina, power, deffence);
        setType(type);
    }


    public Stats getItemStats() {
        return itemStats;
    }

    public void setItemStats(int stamina, int power, int deffence) {
        this.itemStats = new Stats(stamina, power, deffence);
    }

    public ArmourType getType()
    {
        return type;
    }

    public void setType(ArmourType type)
    {
        this.type = type;
    }
}
