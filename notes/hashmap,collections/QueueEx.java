import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Iterator;
public class QueueEx 
{
    public static void main(String[] args) 
    {
        Queue<String> q=new PriorityQueue<>();
        q.add("Apple");
        q.offer("Banana");
        q.add("Carrot");
        q.add("Dolphin");
        q.add("Elephant");
        q.add("Orange");
        q.add("Rose");
        // Head Element
        System.out.println("Head Element = "+q.element());
        System.out.println("Head Element = "+q.peek());

        Iterator<String> it=q.iterator();
        while(it.hasNext())
        {
          System.out.println(it.next());
        }
        // Removal
        q.remove();
        q.poll();

        for(String s:q)
        {
            System.out.println("After Removal"+s);
        }

        

    }
    
}
