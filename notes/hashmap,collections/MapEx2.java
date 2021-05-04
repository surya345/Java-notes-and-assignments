import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class MapEx2 
{
    public static void main(String[] args) 
    {
        Map<Integer,String> map=new Hashtable<>();
        map.put(1, "Amlendu");
        map.put(2, "Pankaj");
        map.put(3,"Balaji");
        map.put(4,"Bhargav");
        map.put(5,"Mahalakshmi");
        //update
        map.put(1,"Abhishek");
        //remove
        map.remove(2);

        System.out.println(map.get(5));
        Set<Integer> keys=map.keySet();
        Set set1=map.entrySet();

        Iterator<Integer> it1=set1.iterator();
        while(it1.hasNext())
        {
            System.out.println(it1.next());
        }

      /** for(int k:keys)
        {
           System.out.println(k+" "+map.get(k));
        }  

        */

    }
    
}
