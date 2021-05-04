public class Products {
    private IProduct product;

    public Products(IProduct product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "{Mobile: " + product + "}";
    }
}
