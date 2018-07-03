package Items;

import Creatures.Stats;

public class Armour extends Item
{
    private Stats itemStats;

    public Armour(String name, int itemLevel, ItemType itemType, int stamina, int power, int deffence)
    {
        super(name, itemLevel, itemType);
        setItemStats(stamina, power, deffence);
    }


    public Stats getItemStats() {
        return itemStats;
    }

    public void setItemStats(int stamina, int power, int deffence) {
        this.itemStats = new Stats(stamina, power, deffence);
    }
}
