package Items;

public class Item
{
    private String itemName;
    private ItemType itemType;

    public Item (String name, ItemType type)
    {
        setItemName(name);
        setItemType(type);
    }

    public String getItemName()
    {
        return itemName;
    }

    private void setItemName(String itemName)
    {
        this.itemName = itemName;
    }

    public ItemType getItemType()
    {
        return itemType;
    }

    private void setItemType(ItemType itemType)
    {
        this.itemType = itemType;
    }
}
