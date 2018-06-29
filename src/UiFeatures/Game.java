package UiFeatures;

public class Game implements Runnable{

    private Display display;
    public int width, height;

    private Thread thread;

    public Game(String title, int width, int height){
        this.width = width;
        this.height = height;

        display = new Display(title, width, height);
    }

    private void init(){
        
    }

    public void run(){
        init();
    }

    public synchronized void start() {
        thread = new Thread(this);
        thread.start();
    }

    public synchronized void stop() {
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
