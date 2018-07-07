package World;

import Creatures.NPC;
import UiFeatures.Assets;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Zone
{
    private String name;
    private int level;
    private BufferedImage background;
    private ArrayList<NPC> monsters;

    public Zone(int level)
    {
        generateZone(level);
    }

    private void generateZone(int level)
    {
        switch (level)
        {
            case 1:
                setFields("Elwyn Forest", 1, Assets.oneMap, );
        }
    }

    private void setFields(String name, int level, BufferedImage background, ArrayList<NPC> monsters)
    {
        this.name = name;
        this.level = level;
        this.background = background;
        this.monsters = new ArrayList<>();
        this.monsters = monsters;
    }
}
