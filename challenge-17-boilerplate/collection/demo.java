import java.util.*;
class demo{
 public static void main(String[] args) {
    //  ArrayList<String> list=new ArrayList<String>();
    //  list.add("suryamsh");
    //  list.add("astro");
    //  list.add("suryamsh");
    //  System.out.println(list);
    //  list.add(1,"back");
    //  System.out.println(list);
    //  list.remove(0);
    //  System.out.println(list);
// HashMap<Integer,String> hmap=new HashMap<Integer,String>();
// hmap.put(1,"ram");
// hmap.put(2,"surya");
// hmap.put(3,"surya");
// hmap.put(null,"");

// System.out.println(hmap);
TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();
     tmap.put(1, "Data1");
      tmap.put(23, "Data2");
      tmap.put(70, "Data3");
      tmap.put(3, "Data4");
      tmap.put(3, "");
System.out.println(tmap);
 }
}