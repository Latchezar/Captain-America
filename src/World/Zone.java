package World;

import Creatures.NPC;
import UiFeatures.Assets;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

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
        String path = "/worlds/zone" + level + ".txt";
        File file = new File(path);
        try {
            Scanner inputData = new Scanner(file);

        String name = inputData.nextLine();
        BufferedImage backgroung = 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
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
