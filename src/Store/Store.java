package Store;

public class Store {
    private int id;
    private String name;
    private int quantity;
    private int price;
    private String productType;

    public Store(int id, String name, int quantity, int price, String productType) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.productType = productType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", productType='" + productType + '\'' +
                '}' + "\n";
    }
    public String getData(){
        return "ID: "+id + ",Tên sp: " + name + ", Số lượng: " + quantity + ", Giá: " + price + ", Loại hàng: " + productType;
    }
}
