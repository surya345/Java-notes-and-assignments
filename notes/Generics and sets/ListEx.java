import java.util.List;
import java.util.ArrayList;
public class ListEx 
{
    public static void main(String[] args) 
    {
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add(10);
        list.add(new Float(5.5));
        list.add("D"); // It will accept duplicate element
        System.out.println("List = "+list);
        
    }
    
}
