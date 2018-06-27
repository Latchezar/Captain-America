package Creatures;

public class Hero extends Creature {
    private final int MAX_LVL = 10;
    private Race race;
    private HeroClass heroClass;
    private Stats heroStats;

    public Hero(String name, int currentLvL, int currenHealth) {
        super(name, 1, defineHealth());
    }

    private int defineHealth() {
        int current = (this.getCurrentLvl() * 40) + this.heroStats.getStamina() *10;
        return current;
    }

    public Race getRace() {
        return race;
    }

    private void setRace(Race race) {
        this.race = race;
    }

    public HeroClass getHeroClass() {
        return heroClass;
    }

    private void setHeroClass(HeroClass heroClass) {
        this.heroClass = heroClass;
    }

    public Stats getHeroStats() {
        return heroStats;
    }

    public void setHeroStats(Stats heroStats) {
        this.heroStats = heroStats;
    }
}
