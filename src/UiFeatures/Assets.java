package UiFeatures;

import java.awt.image.BufferedImage;

public class Assets {

    public static BufferedImage dwarfHunter, dwarfMage, dwarfPaladin, dwarfPriest, dwarfWarrior,
            elfHunter, elfMage, elfPaladin, elfPriest, elfWarrior,
            humanHunter, humanMage, humanPaladin, humanPriest, humanWarrior,
            orcHunter, orcMage, orcPaladin, orcPriest, orcWarrior,
            trollHunter, trollMage, trollPaladin, trollPriest, trollWarrior,
            undeadHunter, undeadMage, undeadPaladin, undeadPriest, undeadWarrior;

    public static void init(){
        //dwarf images
        dwarfHunter = ImageLoader.loadImage("/resources/dwarf-hunter.png");
        dwarfMage = ImageLoader.loadImage("/resources/dwarf-mage.png");
        dwarfPaladin = ImageLoader.loadImage("/resources/dwarf-paladin.png");
        dwarfPriest = ImageLoader.loadImage("/resources/dwarf-priest.png");
        dwarfWarrior = ImageLoader.loadImage("/resources/dwarf-warrior.png");

        //elf images
        elfHunter = ImageLoader.loadImage("resources/elf-hunter.png");
        elfMage = ImageLoader.loadImage("resources/elf-mage.png");
        elfPaladin = ImageLoader.loadImage("resources/elf-paladin.png");
        elfPriest = ImageLoader.loadImage("resources/elf-priest.png");
        elfWarrior = ImageLoader.loadImage("resources/elf-warrior.png");

        //human images
        humanHunter = ImageLoader.loadImage("resources/human-hunter.png");
        humanMage = ImageLoader.loadImage("resources/human-mage.png");
        humanPaladin = ImageLoader.loadImage("resources/human-paladin.png");
        humanPriest = ImageLoader.loadImage("resources/human-priest.png");
        humanWarrior = ImageLoader.loadImage("resources/human-warrior.png");

        //orc images
        orcHunter = ImageLoader.loadImage("resources/orc-hunter.png");
        orcMage = ImageLoader.loadImage("resources/orc-mage.png");
        orcPaladin = ImageLoader.loadImage("resources/orc-paladin.png");
        orcPriest = ImageLoader.loadImage("resources/orc-priest.png");
        orcWarrior = ImageLoader.loadImage("resources/orc-warrior.png");

        //troll images
        trollHunter = ImageLoader.loadImage("resources/troll-hunter.png");
        trollMage = ImageLoader.loadImage("resources/troll-mage.png");
        trollPaladin = ImageLoader.loadImage("resources/troll-paladin.png");
        trollPriest = ImageLoader.loadImage("resources/troll-priest.png");
        trollWarrior = ImageLoader.loadImage("resources/troll-warrior.png");

        //undead images
        undeadHunter = ImageLoader.loadImage("resources/undead-hunter.png");
        undeadMage = ImageLoader.loadImage("resources/undead-mage.png");
        undeadPaladin = ImageLoader.loadImage("resources/undead-paladin.png");
        undeadPriest = ImageLoader.loadImage("resources/undead-priest.png");
        undeadWarrior = ImageLoader.loadImage("resources/undead-warrior.png");
    }
}
