import UiFeatures.Game;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Game game = new Game("New Game", 1200, 800);
        game.start();
    }
}
