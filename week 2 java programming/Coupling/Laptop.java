public class Laptop implements IProduct {
    private String brand;
    private int quantity;
    private int price;

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{Brand: " + brand + ", Quantity: " + quantity + ", Price: " + price + "}";
    }
}
