package Items;

import Creatures.HeroClass;
import Creatures.Stats;

public class Blacksmith
{
    public static void main(String[] args)
    {
        Stats recruitsBladeStats = new Stats();
        recruitsBladeStats.setStrength(1);
        Weapon recruitsBladeType = new Weapon(1, HeroClass.WARRIOR, recruitsBladeStats, 1, 3);
        Item recruitsBlade = new Item("Recruit's Blade", recruitsBladeType);

        Stats recruitsStaffStats = new Stats();
        recruitsStaffStats.setIntellect(1);
        Weapon recruitsStaffType = new Weapon(1, HeroClass.MAGE, recruitsBladeStats, 1, 1);
        Item recruitsStaff = new Item("Recruit's Staff", recruitsStaffType);
    }
}
