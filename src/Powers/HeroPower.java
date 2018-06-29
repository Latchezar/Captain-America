package Powers;

import Creatures.Hero;
import Creatures.HeroClass;

public class HeroPower extends Power {
    private int requiredLvl;
    private HeroClass heroClass;

    public HeroPower(String name, PowerType powerType, int powerDamage, int requiredLvl, HeroClass heroClass)
    {
        super(name, powerType, powerDamage);
        this.requiredLvl = requiredLvl;
        this.heroClass = heroClass;
    }
}
