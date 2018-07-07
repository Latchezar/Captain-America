package UiFeatures;

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

    public Game(String title, int width, int height){
        this.width = width;
        this.height = height;
        this.title = title;

    }

    private void init(){
        display = new Display(title, width, height);
        Assets.init();
    }

    int x = 0;

    private void update(){

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

        g.drawImage(Assets.dwarfHunter, 5, 5, null);

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
