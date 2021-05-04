/**
 * keySet() - Set - Return all the keys
 * values() - Collection - Return all the values
 * entrySet()- Set - Return both key and value pairs
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
class MapEx
{
    public static void main(String[] args) 
    {       //Key  // Value
        Map<String,String> map=new HashMap<>();
        map.put("Name"," Rajeev");
        map.put("Address", "Bengaluru");
        map.put("State", "Karnataka");
        // Overwrites the Map
        map.put("Address", "Tumkuru");


        // System.out.println(map);
        // keySet() - It will return all keys
        Set<String> keys=map.keySet();
        System.out.println(keys);
        Collection values=map.values();
        System.out.println(values);

        for(String key: keys)
        {
           System.out.println(key+" "+map.get(key));
        }
    

        
    }
}