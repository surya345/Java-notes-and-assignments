import java.io.*;
import java.util.*;

class Bank{
    float getRateofInterest(){
        return 0;}}
    class SBI extends Bank{
        float getRateofInterest(){
            return 8.4f;}}
            class RBI extends Bank{
                float getRateofInterest(){
                    return 3.56f; }}
class Testpolymorphism{
    public static void main(String[] args) {
        Bank b;
        b=new SBI();
        System.out.println(b.getRateofInterest());
        b=new RBI();
        System.out.println(b.getRateofInterest());
    }
}
