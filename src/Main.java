import UiFeatures.Game;
import UiFeatures.NameTooLong;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, NameTooLong {
        Game game = new Game("New Game", 1200, 800);
        game.start();
    }
}
