package Creatures;

public class Creature {
    private String name;
    private int currentLvl;
    private int currenHealth;
    private int maxHealth;


    public Creature(String name, int currentLvL, int currenHealth) {
        setName(name);
        setCurrentLvl(currentLvL);
        setCurrenHealth(currenHealth);

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

    private void setCurrentLvl(int currentLvl) {
        this.currentLvl = currentLvl;
    }

    public int getCurrenHealth() {
        return currenHealth;
    }

    private void setCurrenHealth(int currenHealth) {
        this.currenHealth = currenHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    private void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }
}
