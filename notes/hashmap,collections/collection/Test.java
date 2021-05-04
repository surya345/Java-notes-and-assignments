import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {
        
        TreeSet set= new TreeSet();
        set.add(new Student(10));
        set.add(new Student(10));
        set.add(new Student(20));
        set.add(new Student(30));
        set.add(new Student(5));
        System.out.println(set);

        

    }
    
}

class Student /*implements Comparable*/ {

    int  roll;

    Student(int roll){
        this.roll=roll;
    }

    



    @Override
    public int compareTo(Object o) {
        Student s=(Student)o;
        if(this.roll>s.roll)
        return +1;
        else 
        if(this.roll<s.roll)
        return -1;
        else

        return 0;
    }

    @Override
    public String toString() {
        return ""+ roll ;
    }
}
