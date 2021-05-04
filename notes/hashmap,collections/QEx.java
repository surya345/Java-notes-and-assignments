import java.util.PriorityQueue;
import java.util.Queue;

class QEx
{
    public static void main(String[] args) 
    {
        Queue<String> q=new PriorityQueue<>();
        q.add(" ");
        q.poll();
        System.out.println(q.poll());
        
    }
}