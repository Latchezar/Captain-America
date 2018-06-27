package Items;

public abstract class ItemType
{
    private int requiredLevel;

    public ItemType(int requiredLevel)
    {
        setRequiredLevel(requiredLevel);
    }

    public int getRequiredLevel()
    {
        return requiredLevel;
    }

    public void setRequiredLevel(int requiredLevel)
    {
        this.requiredLevel = requiredLevel;
    }
}
