package World;

import Items.Armour;
import Items.ItemType;
import Items.Weapon;
import Items.WeaponType;

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
        levelSixSword = new Weapon("Storm's Wake Hammer", 6, 25, 30, WeaponType.HAMMER);
        levelSixSword = new Weapon("Storm's Wake Staff", 6, 25, 30, WeaponType.STAFF);
        levelSixSword = new Weapon("Storm's Wake Bow", 6, 25, 30, WeaponType.BOW);

        levelSevenSword = new Weapon("Great Sea Warsword", 7, 30, 35, WeaponType.SWORD);
        levelSevenSword = new Weapon("Great Sea Warhammer", 7, 30, 35, WeaponType.HAMMER);
        levelSevenSword = new Weapon("Great Sea Warstaff", 7, 30, 35, WeaponType.STAFF);
        levelSevenSword = new Weapon("Great Sea Warbow", 7, 30, 35, WeaponType.BOW);

        levelEightSword = new Weapon("Mystic Wakener's Sword", 8, 35, 40, WeaponType.SWORD);
        levelEightSword = new Weapon("Mystic Wakener's Hammer", 8, 35, 40, WeaponType.HAMMER);
        levelEightSword = new Weapon("Mystic Wakener's Staff", 8, 35, 40, WeaponType.STAFF);
        levelEightSword = new Weapon("Mystic Wakener's Bow", 8, 35, 40, WeaponType.BOW);

        levelNineSword = new Weapon("Warglaive of Azzinoth", 9, 40, 45, WeaponType.SWORD);
        levelNineSword = new Weapon("Warglaive of Azzinoth", 9, 40, 45, WeaponType.HAMMER);
        levelNineSword = new Weapon("Warglaive of Azzinoth", 9, 40, 45, WeaponType.STAFF);
        levelNineSword = new Weapon("Warglaive of Azzinoth", 9, 40, 45, WeaponType.BOW);

        levelTenSword = new Weapon("Frostmourne", 10, 50, 100, WeaponType.SWORD);
        levelTenSword = new Weapon("Valius, Gavel of the Lightbringer", 10, 50, 100, WeaponType.HAMMER);
        levelTenSword = new Weapon("Halion, Staff of the Forgotten Love", 10, 50, 100, WeaponType.STAFF);
        levelTenSword = new Weapon("Windrunner's Heartseeker", 10, 50, 100, WeaponType.BOW);



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

        levelOneChest = new Armour("Iron Chestplate of the Newbie", 1, ItemType.CHEST)
    }
}
