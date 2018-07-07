package Creatures;

import java.awt.*;

public abstract class Entity {
    protected float x, y;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    protected int width, heigth;

    public Entity(float x, float y, int width, int heigth){
        this.x = x;
        this.y = y;
        this.width = width;
        this.heigth = heigth;
    }

    public abstract void update();
    public abstract void render(Graphics g);
}
