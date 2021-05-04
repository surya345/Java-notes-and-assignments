/**
 * Generic Collection will provide you type safety.
 * It will eliminate the need of Wrapper classes.
 */
import java.util.LinkedList;
public class GenericEx 
{
    public static void main(String[] args) 
    {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
      ll.add("Linked List");
        System.out.println("List = "+ll);
        
    }
    
}
