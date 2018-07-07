package World;

import Items.*;

public class Blacksmith
{
    public void init()
    {
        Weapon  levelOneSword, levelOneHammer, levelOneStaff, levelOneBow,
                levelTwoSword, levelTwoHammer, levelTwoStaff, levelTwoBow,
                levelThreeSword, levelThreeHammer, levelThreeStaff, levelThreeBow,
                levelFourSword, levelFourHammer, levelFourStaff, levelFourBow,
                levelFiveSword, levelFiveHammer, levelFiveStaff, levelFiveBow,
                levelSixSword, levelSixHammer, levelSixStaff, levelSixBow,
                levelSevenSword, levelSevenHammer, levelSevenStaff, levelSevenBow,
                levelEightSword, levelEightHammer, levelEightStaff, levelEightBow,
                levelNineSword, levelNineHammer, levelNineStaff, levelNineBow,
                levelTenSword, levelTenHammer, levelTenStaff, levelTenBow;


        levelOneSword = new Weapon("Mighty Iron Sword", 1, 1, 5, WeaponType.SWORD);
        levelOneHammer = new Weapon("Mighty Iron Hammer", 1, 1, 5, WeaponType.HAMMER);
        levelOneStaff = new Weapon("Mighty Iron Staff", 1, 1, 5, WeaponType.STAFF);
        levelOneBow = new Weapon("Mighty Iron Bow", 1, 1, 5, WeaponType.BOW);

        levelTwoSword = new Weapon("Sword of the Lone Victor", 2, 5, 10, WeaponType.SWORD);
        levelTwoHammer = new Weapon("Hammer of the Lone Victor", 2, 5, 10, WeaponType.HAMMER);
        levelTwoStaff = new Weapon("Staff of the Lone Victor", 2, 5, 10, WeaponType.STAFF);
        levelTwoBow = new Weapon("Bow of the Lone Victor", 2, 5, 10, WeaponType.BOW);

        levelThreeSword = new Weapon("Headhunter's Sword", 3, 10, 15, WeaponType.SWORD);
        levelThreeHammer = new Weapon("Headhunter's Hammer", 3, 10, 15, WeaponType.SWORD);
        levelThreeStaff = new Weapon("Headhunter's Staff", 3, 10, 15, WeaponType.SWORD);
        levelThreeBow = new Weapon("Headhunter's Bow", 3, 10, 15, WeaponType.SWORD);

        levelFourSword = new Weapon("Grave Watcher's Longsword", 4, 15, 20, WeaponType.SWORD);
        levelFourHammer = new Weapon("Grave Watcher's Hammer", 4, 15, 20, WeaponType.HAMMER);
        levelFourStaff = new Weapon("Grave Watcher's Longstaff", 4, 15, 20, WeaponType.STAFF);
        levelFourBow = new Weapon("Grave Watcher's Bow", 4, 15, 20, WeaponType.BOW);

        levelFiveSword = new Weapon("Bloodhunter Greatsword", 5, 20, 25, WeaponType.SWORD);
        levelFiveHammer = new Weapon("Bloodhunter Greathammer", 5, 20, 25, WeaponType.HAMMER);
        levelFiveStaff = new Weapon("Bloodhunter Greatstaff", 5, 20, 25, WeaponType.STAFF);
        levelFiveBow = new Weapon("Bloodhunter Greatbow", 5, 20, 25, WeaponType.BOW);

        levelSixSword = new Weapon("Storm's Wake Sword", 6, 25, 30, WeaponType.SWORD);
        levelSixHammer = new Weapon("Storm's Wake Hammer", 6, 25, 30, WeaponType.HAMMER);
        levelSixStaff = new Weapon("Storm's Wake Staff", 6, 25, 30, WeaponType.STAFF);
        levelSixBow = new Weapon("Storm's Wake Bow", 6, 25, 30, WeaponType.BOW);

        levelSevenSword = new Weapon("Great Sea Warsword", 7, 30, 35, WeaponType.SWORD);
        levelSevenHammer = new Weapon("Great Sea Warhammer", 7, 30, 35, WeaponType.HAMMER);
        levelSevenStaff = new Weapon("Great Sea Warstaff", 7, 30, 35, WeaponType.STAFF);
        levelSevenBow = new Weapon("Great Sea Warbow", 7, 30, 35, WeaponType.BOW);

        levelEightSword = new Weapon("Mystic Wakener's Sword", 8, 35, 40, WeaponType.SWORD);
        levelEightHammer = new Weapon("Mystic Wakener's Hammer", 8, 35, 40, WeaponType.HAMMER);
        levelEightStaff = new Weapon("Mystic Wakener's Staff", 8, 35, 40, WeaponType.STAFF);
        levelEightBow = new Weapon("Mystic Wakener's Bow", 8, 35, 40, WeaponType.BOW);

        levelNineSword = new Weapon("Warglaive of Azzinoth", 9, 40, 45, WeaponType.SWORD);
        levelNineHammer = new Weapon("Warhammer of Azzinoth", 9, 40, 45, WeaponType.HAMMER);
        levelNineStaff = new Weapon("Warstaff of Azzinoth", 9, 40, 45, WeaponType.STAFF);
        levelNineBow = new Weapon("Warbow of Azzinoth", 9, 40, 45, WeaponType.BOW);

        levelTenSword = new Weapon("Frostmourne", 10, 50, 100, WeaponType.SWORD);
        levelTenHammer = new Weapon("Valius, Gavel of the Lightbringer", 10, 50, 100, WeaponType.HAMMER);
        levelTenStaff = new Weapon("Halion, Staff of the Forgotten Love", 10, 50, 100, WeaponType.STAFF);
        levelTenBow = new Weapon("Windrunner's Heartseeker", 10, 50, 100, WeaponType.BOW);



        Armour  levelOneChest, levelOneHelmet, levelOneBoots,
                levelTwoChest, levelTwoHelmet, levelTwoBoots,
                levelThreeChest, levelThreeHelmet, levelThreeBoots,
                levelFourChest, levelFourHelmet, levelFourBoots,
                levelFiveChest, levelFiveHelmet, levelFiveBoots,
                levelSixChest, levelSixHelmet, levelSixBoots,
                levelSevenChest, levelSevenHelmet, levelSevenBoots,
                levelEightChest, levelEightHelmet, levelEightBoots,
                levelNineChest, levelNineHelmet, levelNineBoots,
                levelTenChest, levelTenHelmet, levelTenBoots;

        levelOneChest = new Armour("Iron Chestplate of the Newbie", 1, 1,1,1, ArmourType.CHEST);
        levelOneHelmet = new Armour("Iron Helmet of the Newbie", 1, 1,1,1, ArmourType.HELMET);
        levelOneBoots = new Armour("Leather Boots of the Newbie", 1, 1,1,1, ArmourType.BOOTS);

        levelTwoChest = new Armour("Honorable Fighter's Chest", 2, 2,2,2, ArmourType.CHEST);
        levelTwoHelmet = new Armour("Honorable Fighter's Helmet", 2, 2,2,2, ArmourType.HELMET);
        levelTwoBoots = new Armour("Honorable Fighter's Boots", 2, 2,2,2, ArmourType.BOOTS);

        levelThreeChest = new Armour("Chestguard of Alarming Dreams", 3, 3,3,3, ArmourType.CHEST);
        levelThreeHelmet = new Armour("Helm of the Night Watchman", 3, 3,3,3, ArmourType.HELMET);
        levelThreeBoots = new Armour("The Darkspeaker's Iron Walkers", 3, 3,3,3, ArmourType.BOOTS);

        levelFourChest = new Armour("Dead-Watcher Breastplate", 4, 4,4,4, ArmourType.CHEST);
        levelFourHelmet = new Armour("Puncture-Proof Headguard", 4, 4,4,4, ArmourType.HELMET);
        levelFourBoots = new Armour("Greaves of Vaulted Skies", 4, 4,4,4, ArmourType.BOOTS);

        levelFiveChest = new Armour("Dread Gladiato's Plate Armour", 5, 5,5,5, ArmourType.CHEST);
        levelFiveHelmet = new Armour("Rage-Blind Faceguard", 5, 5,5,5, ArmourType.HELMET);
        levelFiveBoots = new Armour("Truesteel Boots", 5, 5,5,5, ArmourType.BOOTS);

        levelSixChest = new Armour("Ogre-Slayer Chestplate", 6, 6,6,6, ArmourType.CHEST);
        levelSixHelmet = new Armour("Ogreskull Boneplate Greathelm", 6, 6,6,6, ArmourType.HELMET);
        levelSixBoots = new Armour("Ogre-Eater Treads", 6, 6,6,6, ArmourType.BOOTS);

        levelSevenChest = new Armour("Sea Raider's Chestplate", 7, 7,7,7, ArmourType.CHEST);
        levelSevenHelmet = new Armour("Crown of Desolation", 7, 7,7,7, ArmourType.HELMET);
        levelSevenBoots = new Armour("Arcane Defender's Boots", 7, 7,7,7, ArmourType.BOOTS);

        levelEightChest = new Armour("Breastplate of Raging Fury", 8, 8,8,8, ArmourType.CHEST);
        levelEightHelmet = new Armour("Nightsfall Helmet", 8, 8,8,8, ArmourType.HELMET);
        levelEightBoots = new Armour("Nightguard Stompers", 8, 8,8,8, ArmourType.BOOTS);

        levelNineChest = new Armour("Magma Plated Chestguard", 9, 9,9,9, ArmourType.CHEST);
        levelNineHelmet = new Armour("Demonsteel Helm", 9, 9,9,9, ArmourType.HELMET);
        levelNineBoots = new Armour("Warboots of Smoldering Fury", 9, 9,9,9, ArmourType.BOOTS);

        levelTenChest = new Armour("Chestguard of Terminal End", 20, 20,20,20, ArmourType.CHEST);
        levelTenHelmet = new Armour("Warhelm of the Obsidian Aspect", 20, 20,20,20, ArmourType.HELMET);
        levelTenBoots = new Armour("Soul Crushing Stompers", 20, 20,20,20, ArmourType.BOOTS);
    }
}
