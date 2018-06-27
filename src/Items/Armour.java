package Items;

public class Armour extends ItemType
{
    private int defence; // reduces damage taken

    public Armour(int requiredLevel, int defence)
    {
        super(requiredLevel);
        this.defence = defence;
    }

    public int getDefence()
    {
        return defence;
    }
}
