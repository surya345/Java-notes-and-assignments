/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.setBrand("Samsung");
        mobile.setQuantity(5);
        mobile.setPrice(15000);

        Laptop laptop = new Laptop();
        laptop.setBrand("Dell");
        laptop.setQuantity(7);
        laptop.setPrice(35000);
        
        Products product1 = new Products(mobile);
        Products product2 = new Products(laptop);

        System.out.println(product1);
        System.out.println(product2);

    }
}