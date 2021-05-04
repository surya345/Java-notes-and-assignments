import java.util.HashSet;
import java.util.Set;
class SetEx
{
    public static void main(String[] args) 
    {
      Set set=new HashSet();
      set.add("Amlendu");
      set.add("Kamran");
      set.add("Pranjal");
      set.add(new Integer(5));
      set.add(new Float(4.5f));
      set.add("Pranjal"); // It will not accept duplicate
      System.out.println("Elements = "+set);
}
}
