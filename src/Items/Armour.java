package Items;

public class Armour extends ItemType
{
    private int defence; // reduces damage taken

    public int getDefence()
    {
        return defence;
    }

    public void setDefence(int defence)
    {
        this.defence = defence;
    }
}
