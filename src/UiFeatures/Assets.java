package UiFeatures;

import java.awt.image.BufferedImage;

public class Assets {

    public static BufferedImage dwarfHunter, dwarfMage, dwarfPaladin, dwarfPriest, dwarfWarrior,
            elfHunter, elfMage, elfPaladin, elfPriest, elfWarrior,
            humanHunter, humanMage, humanPaladin, humanPriest, humanWarrior,
            orcHunter, orcMage, orcPaladin, orcPriest, orcWarrior,
            trollHunter, trollMage, trollPaladin, trollPriest, trollWarrior,
            undeadHunter, undeadMage, undeadPaladin, undeadPriest, undeadWarrior, wolf,
            hogger, boar, vultros, kingBangalash, panther, lurid, skeleton,
            stiches, ghoul, hahkZor, ogre, nagaBoss, naga, bearBoss, shadowWeaver, illidan,
            felguard, lichKing, voidWalker;

    public static void init(){
        //dwarf images
        dwarfHunter = ImageLoader.loadImage("/dwarf-hunter.png");
        dwarfMage = ImageLoader.loadImage("/dwarf-mage.png");
        dwarfPaladin = ImageLoader.loadImage("/dwarf-paladin.png");
        dwarfPriest = ImageLoader.loadImage("/dwarf-priest.png");
        dwarfWarrior = ImageLoader.loadImage("/dwarf-warrior.png");

        //elf images
        elfHunter = ImageLoader.loadImage("/elf-hunter.png");
        elfMage = ImageLoader.loadImage("/elf-mage.png");
        elfPaladin = ImageLoader.loadImage("/elf-paladin.png");
        elfPriest = ImageLoader.loadImage("/elf-priest.png");
        elfWarrior = ImageLoader.loadImage("/elf-warrior.png");

        //human images
        humanHunter = ImageLoader.loadImage("/human-hunter.png");
        humanMage = ImageLoader.loadImage("/human-mage.png");
        humanPaladin = ImageLoader.loadImage("/human-paladin.png");
        humanPriest = ImageLoader.loadImage("/human-priest.png");
        humanWarrior = ImageLoader.loadImage("/human-warrior.png");

        //orc images
        orcHunter = ImageLoader.loadImage("/orc-hunter.png");
        orcMage = ImageLoader.loadImage("/orc-mage.png");
        orcPaladin = ImageLoader.loadImage("/orc-paladin.png");
        orcPriest = ImageLoader.loadImage("/orc-priest.png");
        orcWarrior = ImageLoader.loadImage("/orc-warrior.png");

        //troll images
        trollHunter = ImageLoader.loadImage("/troll-hunter.png");
        trollMage = ImageLoader.loadImage("/troll-mage.png");
        trollPaladin = ImageLoader.loadImage("/troll-paladin.png");
        trollPriest = ImageLoader.loadImage("/troll-priest.png");
        trollWarrior = ImageLoader.loadImage("/troll-warrior.png");

        //undead images
        undeadHunter = ImageLoader.loadImage("/undead-hunter.png");
        undeadMage = ImageLoader.loadImage("/undead-mage.png");
        undeadPaladin = ImageLoader.loadImage("/undead-paladin.png");
        undeadPriest = ImageLoader.loadImage("/undead-priest.png");
        undeadWarrior = ImageLoader.loadImage("/undead-warrior.png");

        // monsters

        wolf          = ImageLoader.loadImage("/lvl1m.png");
        hogger        = ImageLoader.loadImage("/lvl1b.png");
        boar          = ImageLoader.loadImage("/lvl2m.png");
        vultros       = ImageLoader.loadImage("/lvl2b.png");
        kingBangalash = ImageLoader.loadImage("/lvl3b.png");
        panther       = ImageLoader.loadImage("/lvl3m.png");
        lurid         = ImageLoader.loadImage("/lvl4b.png");
        skeleton      = ImageLoader.loadImage("/lvl4m.png");
        stiches       = ImageLoader.loadImage("/lvl5b.png");
        ghoul         = ImageLoader.loadImage("/lvl5m.png");
        hahkZor       = ImageLoader.loadImage("/lvl6b.png");
        ogre          = ImageLoader.loadImage("/lvl6m.png");
        nagaBoss      = ImageLoader.loadImage("/lvl7b.png");
        naga          = ImageLoader.loadImage("/lvl7m.png");
        bearBoss      = ImageLoader.loadImage("/lvl8b.png");
        shadowWeaver  = ImageLoader.loadImage("/lvl8m.png");
        illidan       = ImageLoader.loadImage("/lvl9b.png");
        felguard      = ImageLoader.loadImage("/lvl9m.png");
        lichKing      = ImageLoader.loadImage("/lvl10b.png");
        voidWalker    = ImageLoader.loadImage("/lvl10m.png");

        // lvl - level, m - monster, b - boss
    }
}
