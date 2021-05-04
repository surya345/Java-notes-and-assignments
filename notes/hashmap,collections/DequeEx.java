import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx 
{
    public static void main(String[] args) 
    {
        Deque<String> dq=new ArrayDeque<>();
        dq.add("One");
        dq.add("Two");
        dq.add("Three");
        dq.add("Four");
        dq.add("Five");
        dq.add("Six");
        dq.addFirst("Zero");
        dq.addLast("Seven");
         // Displaying First and Last Element
        System.out.println("First Element = "+dq.getFirst());
        System.out.println("Last Element = "+dq.getLast());

        for(String s:dq)
        {
            System.out.println("Deque Elements = "+s);
        }
        // Removal
        dq.removeFirst();
        dq.pollLast();
        for(String s:dq)
        {
            System.out.println("After Removal = "+s);
        }


    }
}
