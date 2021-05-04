public class Rectangle extends Shape {

    public Rectangle(double length, double breadth) {
        super(length, breadth);
        
    }

    @Override
    public double area() {
        System.out.println(getLength());
  System.out.println(getBreadth());
   return getLength()*getBreadth();
    }

    @Override
    public double circumference() {
        return 0;
    }   
}
