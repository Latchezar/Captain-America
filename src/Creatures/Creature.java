package Creatures;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class Creature {
    public static final int DEFAULT_WIDTH = 200,
                            DEFAULT_HEIGTH = 370;
    private String name;
    private int currentLvl;
    private int currenHealth;
    protected BufferedImage image;
    protected float x, y;
    protected int width, heigth;


    public Creature(String name, int currentLvl, float x, float y, int width, int heigth) {
        setName(name);
        setCurrentLvl(currentLvl);
        setCurrenHealth();
        this.x = x;
        this.y = y;
        this.width = width;
        this.heigth = heigth;
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
    public BufferedImage getImage(){
        return image;
    }
    public void setCoordinates(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return (int)x;
    }
    public int getY(){
        return (int)y;
    }
    public int getDefaultWidth(){
        return DEFAULT_WIDTH;
    }
    public int getDefaultHeigth(){
        return DEFAULT_HEIGTH;
    }


    public abstract void update();
    public void render(Graphics g, int x, int y) {
        g.drawImage(image, x, y, width, heigth, null);
    }
    public abstract void setImage();

}
