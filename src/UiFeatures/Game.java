package UiFeatures;

public class Game implements Runnable{

    private Display display;
    public int width, height;
    public String title;

    private boolean isRunning = false;
    private Thread thread;

    public Game(String title, int width, int height){
        this.width = width;
        this.height = height;
        this.title = title;

    }

    private void init(){
        display = new Display(title, width, height);

    }

    private void update(){

    }

    private void render(){

    }

    public void run(){
        init();

        while (isRunning){

            update();
            render();

            stop();
        }

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
