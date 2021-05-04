import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.HashSet;


class Demoset{
    public static void main(String[] args) throws IOException {
       Set set=new HashSet(); 
       set.add("suryansh");
       set.add("pankaj");
       set.add("Ayush");
       set.add(Integer.parseInt("45"));
       set.add(Double.parseDouble("4.04"));
       set.add(new Integer(4));
       System.out.println("Elements="+set);
    }
}