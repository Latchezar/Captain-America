package UiFeatures.states;

import UiFeatures.Assets;
import UiFeatures.Game;

import java.awt.*;

public class GameState extends State {

    public GameState(Game game){
        super(game);
    }

    @Override
    public void update() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.dwarfHunter, 5, 5, null);
    }
}
