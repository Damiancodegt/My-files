public class InventoryItem{
    private String itemId;
    private String name;
    private String batchNumber;

    public InventoryItem(String itemId, String name, String batchNumber) {
        this.itemId = itemId;
        this.name = name;
        this.batchNumber = batchNumber;

    }

    public String getItemId() {
        return itemId;
    }
    public String getName() {
        return name;
    }
    public String getBatchNumber() {
        return name;
    }

    public void setItemId() {
        this.itemId = itemId;
    }
    public void setName() {
        this.name = name;
    }
    public void seBatchNumber() {
        this.batchNumber = batchNumber;
    }

    public void displayDetails() {
        System.out.println("Enter Item Id: "+ itemId);
        System.out.println("Enter Name: "+ name);
        System.out.println("Enter Batch Number: "+ batchNumber);
    }
}
