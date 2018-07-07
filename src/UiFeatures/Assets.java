package UiFeatures;

import java.awt.image.BufferedImage;

public class Assets {

    public static BufferedImage dwarfHunter, dwarfMage, dwarfPaladin, dwarfPriest, dwarfWarrior,
            elfHunter, elfMage, elfPaladin, elfPriest, elfWarrior,
            humanHunter, humanMage, humanPaladin, humanPriest, humanWarrior,
            orcHunter, orcMage, orcPaladin, orcPriest, orcWarrior,
            trollHunter, trollMage, trollPaladin, trollPriest, trollWarrior,
<<<<<<< HEAD
            undeadHunter, undeadMage, undeadPaladin, undeadPriest, undeadWarrior, wolf,
            hogger, boar, vultros, kingBangalash, panther, lurid, skeleton,
            stiches, ghoul, hahkZor, ogre, nagaBoss, naga, bearBoss, shadowWeaver, illidan,
            felguard, lichKing, voidWalker, elwynForest, westfall, strv, graveyard,
            duskwood, hellfire, zangarmash, ashenvale, blackTemple, icecrown;
=======
            undeadHunter, undeadMage, undeadPaladin, undeadPriest, undeadWarrior,
            oneMob, oneBoss, twoMob, twoBoss, threeMob, threeBoss, fourBoss, fourMob,
            fiveMob, fiveBoss, sixBoss, sixMob, sevenBoss, sevenMob, eightBoss, eightMob,
            nineBoss, nineMob, tenBoss, tenMob;
>>>>>>> 5c72e798e4ea05ba4c3fa766541b6052fba862ea

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

        oneMob          = ImageLoader.loadImage("/lvl1m.png");
        oneBoss        = ImageLoader.loadImage("/lvl1b.png");
        twoMob          = ImageLoader.loadImage("/lvl2m.png");
        twoBoss       = ImageLoader.loadImage("/lvl2b.png");
        threeBoss = ImageLoader.loadImage("/lvl3b.png");
        threeMob       = ImageLoader.loadImage("/lvl3m.png");
        fourBoss         = ImageLoader.loadImage("/lvl4b.png");
        fourMob      = ImageLoader.loadImage("/lvl4m.png");
        fiveBoss       = ImageLoader.loadImage("/lvl5b.png");
        fiveMob         = ImageLoader.loadImage("/lvl5m.png");
        sixBoss       = ImageLoader.loadImage("/lvl6b.png");
        sixMob          = ImageLoader.loadImage("/lvl6m.png");
        sevenBoss      = ImageLoader.loadImage("/lvl7b.png");
        sevenMob          = ImageLoader.loadImage("/lvl7m.png");
        eightBoss      = ImageLoader.loadImage("/lvl8b.png");
        eightMob  = ImageLoader.loadImage("/lvl8m.png");
        nineBoss       = ImageLoader.loadImage("/lvl9b.png");
        nineMob      = ImageLoader.loadImage("/lvl9m.png");
        tenBoss      = ImageLoader.loadImage("/lvl10b.png");
        tenMob    = ImageLoader.loadImage("/lvl10m.png");

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
