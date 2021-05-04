import java.util.Stack;

public class StackDemo {
    
    public static void main(String[] args) {
        
        Stack<String> st= new Stack<String>();
       String str=(String) st.push("A");
       
       st.push("B");
       st.push("C");
       st.push("D");//4
       st.push("E");
      // st.push(true);
       //st.push(new Student("Pranay"));//last data marks as a Top
       System.out.println(st); 
       System.out.println(st.pop()); 
      System.out.println(st);
      System.out.println(st.peek());
      System.out.println(st);
      System.out.println(st.isEmpty());
     
       System.out.println( st.search("Z")); 

    }
}

class Student {
    String name;

    public Student(String name) {
        this.name= name;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + "]";
    }


}
