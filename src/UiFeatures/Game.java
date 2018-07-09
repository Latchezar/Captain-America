package UiFeatures;

import Creatures.*;
import UiFeatures.states.GameState;
import UiFeatures.states.MenuState;
import UiFeatures.states.State;
import World.Zone;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Game implements Runnable{

    private Display display;
    public int width, height;
    public String title;

    private boolean isRunning = false;
    private Thread thread;

    private BufferStrategy bs;
    private Graphics g;
    private Zone currentZone;
    private Hero char1;

    //states
    private State gameState;
    private State menuState;

    //Input
    private KeyManager keyManager;

    public Game(String title, int width, int height) throws IOException, NameTooLong{
        this.width = width;
        this.height = height;
        this.title = title;
        keyManager = new KeyManager();
        char1 = new Mage("Test Char", Race.UNDEAD, 0, 0);
        currentZone = new Zone(1, char1); // for test
    }

    private void init(){
        display = new Display(title, width, height);
        display.getDisplayFrame().addKeyListener(keyManager);
        Assets.init();

        gameState = new GameState(this);
        menuState = new MenuState(this);
        State.setState(gameState);
    }


    private void update(){
        keyManager.update();

        if (State.getStat() != null) {
            State.getStat().update();
        }
    }


    private void render(){
        bs = display.getDisplayCanvas().getBufferStrategy();
        if(bs == null) {
            display.getDisplayCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();
        //clear the screen
        g.clearRect(0, 0, width, height);
        // draw here
        g.drawImage(Assets.tenMap, 0, 0, 1200, 800, null);
        g.drawImage(Assets.humanWarrior, 50, 300, null);
        g.drawImage(Assets.tenMob, 600, 300, null);
        g.drawImage(Assets.tenBoss, 900, 150, 300, 555, null);
        //draw end
        bs.show();
        g.dispose();
    }

    public void run(){
        init();

        int fps = 60;
        double timePerTick = 1000000000 / fps;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();

        while (isRunning){
            now = System.nanoTime();
            delta += (now - lastTime) / timePerTick;
            lastTime = now;

            if (delta >=  1) {
                update();
                render();
                delta--;
            }

        }
        stop();

    }

    public KeyManager getKeyManager(){
        return keyManager;
    }

    public synchronized void start() {
        if (isRunning){
            return;
        }
        isRunning = true;
        thread = new Thread(this);
        thread.start();
    }

    public synchronized void stop() {
        if (!isRunning){
            return;
        }
        isRunning = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
