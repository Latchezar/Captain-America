package UiFeatures;

import UiFeatures.states.GameState;
import UiFeatures.states.MenuState;
import UiFeatures.states.State;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class Game implements Runnable{

    private Display display;
    public int width, height;
    public String title;

    private boolean isRunning = false;
    private Thread thread;

    private BufferStrategy bs;
    private Graphics g;

    //states
    private State gameState;
    private State menuState;

    public Game(String title, int width, int height){
        this.width = width;
        this.height = height;
        this.title = title;
    }

    private void init(){
        display = new Display(title, width, height);
        Assets.init();

        gameState = new GameState(this);
        menuState = new MenuState(this);
        State.setState(gameState);
    }


    private void update(){
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
        if (State.getStat() != null) {
            State.getStat().render(g);
        }

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
