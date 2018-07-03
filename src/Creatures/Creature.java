package Creatures;

public class Creature {
    private String name;
    private int currentLvl;
    private int currenHealth;

    public Creature(String name, int currentLvl) {
        setName(name);
        setCurrentLvl(currentLvl);
        setCurrenHealth();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getCurrentLvl() {
        return currentLvl;
    }

    protected void setCurrentLvl(int currentLvl) {
        this.currentLvl = currentLvl;
    }

    public int getCurrenHealth() {
        return currenHealth;
    }

    private void setCurrenHealth() {
        currenHealth = currentLvl * 10;
    }
    void setCurrenHealth(int currenHealth) {
        this.currenHealth = currenHealth;
    }

}
