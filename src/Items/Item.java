package Items;


public abstract class Item
{
    private String itemName;
    private int itemLevel;
    private ItemType itemType;

    public Item (String name, int itemLevel, ItemType itemType)
    {
        setItemName(name);
        setItemLevel(itemLevel);
        setItemType(itemType);
    }

    public ItemType getItemType() {
        return itemType;
    }

    private void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public String getItemName()
    {
        return itemName;
    }

    private void setItemName(String itemName)
    {
        this.itemName = itemName;
    }

    public int getItemLevel()
    {
        return itemLevel;
    }

    public void setItemLevel(int itemLevel)
    {
        this.itemLevel = itemLevel;
    }
}
