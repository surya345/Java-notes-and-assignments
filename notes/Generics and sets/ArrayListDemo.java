import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo 
{
    public static void main(String[] args) 
    {
        ArrayList<String> al=new ArrayList<>(); // Cart
        System.out.println("Initial Size of ArrayList = "+al.size());
        // Adding Product into a Cart
        al.add("Parle-G");
        al.add("Dairy Milk");
        al.add("Lays");
        al.add("Kurkure");
        al.add("Good Day");
        al.add(1, "KitKat");
        al.add(4, "Moms Magic");
        System.out.println("Size of ArrayList = "+al.size());
        // Displaying all products in a Cart
        Iterator it1=al.iterator();
        while(it1.hasNext())
        {
            System.out.println("Product = "+it1.next());
        }  
        
        // Retrieve a Particular Product
        System.out.println("Product = "+al.get(2));
        // Upadte a Product
            al.set(4, "Bourn Bourn");
            System.out.println("Updated Product = "+al.get(4));
        // Deleting a Product
        al.remove(3);
        al.remove("Kurkure");
        for(String s:al)
        {
            System.out.println("After Removal"+s);
        }

    }
    
}
