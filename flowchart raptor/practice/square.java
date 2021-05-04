public class square implements shape {
    private double length, breadth;
    public square(){

    }
   public square(double length,double breadth){
       this.length=length;
       this.breadth=breadth;
   }

    @Override
    public double area() {
        System.out.println("hi");
        return length+breadth;
    }

    @Override
    public double circumference() {
        System.out.println("hello");
    return 2*(length+breadth);
    }
    
}
