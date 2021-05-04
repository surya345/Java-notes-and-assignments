public class Mobile implements IProduct {
    private String brand;
    private int quantity;
    private int price;

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "{Brand: " + brand + ", Quantity: " + quantity + ", Price: " + price + "}";
    }
}
