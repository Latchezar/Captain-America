package Creatures;

import UiFeatures.NameTooLong;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class Creature {
    public static final int DEFAULT_WIDTH = 200,
                            DEFAULT_HEIGHT = 370;
    private String name;
    private int currentLvl;
    private int currentHealth;
    protected BufferedImage image;
    protected float x, y;
    protected int width, height;


    public Creature(String name, int currentLvl, float x, float y, int width, int height) throws NameTooLong{
        if (name.length() > 35 || name.length() < 3){
            throw new NameTooLong();
        } else {
            setName(name);
            setCurrentLvl(currentLvl);
            setCurrentHealth();
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }
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

    public int getCurrentHealth() {
        return currentHealth;
    }

    private void setCurrentHealth() {
        currentHealth = currentLvl * 10;
    }
    void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
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
    public int getDefaultHeight(){
        return DEFAULT_HEIGHT;
    }


    public abstract void update();
    public void render(Graphics g, int x, int y) {
        g.drawImage(image, x, y, width, height, null);
    }
    public abstract void setImage();

}
