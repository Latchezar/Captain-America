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
            felguard, lichKing, voidWalker, elwynForest, westfall, strv, graveyard,
            duskwood, hellfire, zangarmash, ashenvale, blackTemple, icecrown;

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

        // monsters

        wolf          = ImageLoader.loadImage("resources/lvl1m.png");
        hogger        = ImageLoader.loadImage("resources/lvl1b.png");
        boar          = ImageLoader.loadImage("resources/lvl2m.png");
        vultros       = ImageLoader.loadImage("resources/lvl2b.png");
        kingBangalash = ImageLoader.loadImage("resources/lvl3b.png");
        panther       = ImageLoader.loadImage("resources/lvl3m.png");
        lurid         = ImageLoader.loadImage("resources/lvl4b.png");
        skeleton      = ImageLoader.loadImage("resources/lvl4m.png");
        stiches       = ImageLoader.loadImage("resources/lvl5b.png");
        ghoul         = ImageLoader.loadImage("resources/lvl5m.png");
        hahkZor       = ImageLoader.loadImage("resources/lvl6b.png");
        ogre          = ImageLoader.loadImage("resources/lvl6m.png");
        nagaBoss      = ImageLoader.loadImage("resources/lvl7b.png");
        naga          = ImageLoader.loadImage("resources/lvl7m.png");
        bearBoss      = ImageLoader.loadImage("resources/lvl8b.png");
        shadowWeaver  = ImageLoader.loadImage("resources/lvl8m.png");
        illidan       = ImageLoader.loadImage("resources/lvl9b.png");
        felguard      = ImageLoader.loadImage("resources/lvl9m.png");
        lichKing      = ImageLoader.loadImage("resources/lvl10b.png");
        voidWalker    = ImageLoader.loadImage("resources/lvl10m.png");

        // lvl - level, m - monster, b - boss

        // zones

        elwynForest = ImageLoader.loadImage("resources/lvl1z");
        westfall    = ImageLoader.loadImage("resources/lvl2z");
        strv        = ImageLoader.loadImage("resources/lvl3z");
        graveyard   = ImageLoader.loadImage("resources/lvl4z");
        duskwood    = ImageLoader.loadImage("resources/lvl5z");
        hellfire    = ImageLoader.loadImage("resources/lvl6z");
        zangarmash  = ImageLoader.loadImage("resources/lvl7z");
        ashenvale   = ImageLoader.loadImage("resources/lvl8z");
        blackTemple = ImageLoader.loadImage("resources/lvl9z");
        icecrown    = ImageLoader.loadImage("resources/lvl10z");
    }
}
