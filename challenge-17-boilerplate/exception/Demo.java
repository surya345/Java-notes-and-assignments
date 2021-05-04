import java.util.InputMismatchException;
import java.util.Scanner;
class NumeratorIsSmallerException extends Exception{
    public NumeratorIsSmallerException(){
//?? why constructor is defined here
    }
public NumeratorIsSmallerException(String msg){
    super(msg);
}
}
class Calculator{
    public int Divide(int numerator,int Denominator)throws NumeratorIsSmallerException{
        if(numerator<Denominator){
            throw new NumeratorIsSmallerException();
        }
        return numerator/Denominator;
    }
}
class Demo{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
      int num1,num2,result=0;
      System.out.println("enter two numbers");
     try{ num1=scan.nextInt();
      num2=scan.nextInt();
      Calculator calc = new Calculator();
      result= calc.Divide(num1, num2);
      if(num1<num2){
          throw new NumeratorIsSmallerException();
      }
        result=num1/num2;}
        catch(ArithmeticException e1){
            System.out.println("divide by zero");
        }
        catch(InputMismatchException e2){
            System.out.println("hey");
        }
        // catch(IllegalAccessException ile){
        //     System.out.println("haay");
        // }
        catch(Exception e){
        System.out.println("Invalid");
     }
     finally{
        System.out.println(result);
        System.out.println("hello"); 
     }
        
}}  

