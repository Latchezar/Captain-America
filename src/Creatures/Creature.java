package Creatures;

import java.awt.*;

public abstract class Creature extends Entity{
    public static final int DEFAULT_WIDTH = 200,
                            DEFAULT_HEIGTH = 370;
    private String name;
    private int currentLvl;
    private int currenHealth;

    public Creature(String name, int currentLvl, float x, float y, int width, int heigth) {
        super(x, y, width, heigth);
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


    public abstract void update();

    public abstract void render(Graphics g);

}
