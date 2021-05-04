public class calc{
    public static void main(String[] args) {
        Scientificcalculator calc32=new Scientificcalculator();
        System.out.println(calc32.multiply(32));
        System.out.println(calc32.cube(45));
        System.out.print(calc32.sum(10,20));
    }
}

class calculator{
    
    public int sum(int a, int b) {
       return a+b;
    }
    public int subtract(int a,int b){
        return a-b;
    }
}
class Scientificcalculator extends calculator{
int a=30,b=40;
public int multiply(int num){
    return num*a*b;
}
public int cube(int num){
    return num*a*b*b;
}
}