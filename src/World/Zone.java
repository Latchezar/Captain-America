package World;

import Creatures.Hero;
import Creatures.NPC;
import Creatures.NPCType;
import Items.Item;
import UiFeatures.Assets;
import UiFeatures.NameTooLong;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Zone
{
    private String name;
    private int level;
    private BufferedImage background;
    private NPC monster;
    private NPC boss;
    private Hero character;

    public Zone(int level, Hero character) throws IOException, NameTooLong{
        this.character = character;
        generateZone(level);
    }

    private void generateZone(int level) throws IOException, NameTooLong {
        String path = "resources/zone" + level + ".txt";
        File file = new File(path);
        try {
            BufferedReader inputData= new BufferedReader(new FileReader(path));
            //Scanner inputData = new Scanner(file);

            String name = inputData.readLine();
            this.background = setBackground(level);
            String row = inputData.readLine();
            String[] coordinates = row.split(" ");
            this.character.setCoordinates(Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1]));
            row = inputData.readLine();
            String[] monsterData = row.split(" ");
            String monsterName = monsterData[0].replace("-", " ");
            float x = (float) Integer.parseInt(monsterData[1]);
            float y = (float) Integer.parseInt(monsterData[2]);
            monster = new NPC(monsterName, level, NPCType.MOB, x, y);
            row = inputData.readLine();
            String[] bossData = row.split(" ");
            String bossName = bossData[0].replace("-", " ");
            x = (float) Integer.parseInt(bossData[1]);
            y = (float) Integer.parseInt(bossData[2]);
            boss = new NPC(monsterName, level, NPCType.BOSS, x , y);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private BufferedImage setBackground(int level) {
        switch (level) {
            case 1:
                return Assets.oneMap;
            case 2:
                return Assets.twoMap;
            case 3:
                return Assets.threeMap;
            case 4:
                return Assets.fourMap;
            case 5:
                return Assets.fiveMap;
            case 6:
                return Assets.sixMap;
            case 7:
                return Assets.sevenMap;
            case 8:
                return Assets.eightMap;
            case 9:
                return Assets.nineMap;
            case 10:
                return Assets.tenMap;
        }
        return null;
    }

    public void render(Graphics g){
        g.drawImage(this.background, 0, 0, 1200, 800, null);
        monster.render(g, monster.getX(), monster.getY());
        boss.render(g, boss.getX(), boss.getY());
        character.render(g, character.getX(), character.getY());
    }
}
