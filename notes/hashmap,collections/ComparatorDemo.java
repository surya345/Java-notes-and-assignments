import java.util.Comparator;
import java.util.TreeSet;

class ComparatorDemo{
    public static void main(String[] args) {
        
        TreeSet tset= new TreeSet<>(new MyComparator());
        tset.add(new Student1("Pranay", 101));
        tset.add(new Student1("Kamran", 102));
        tset.add(new Student1("Devid", 103));
        tset.add(new Student1("Vikhil", 105));
        tset.add(new Student1("Yamini", 103));

        System.out.println(tset);
    }


}

class Student1 implements Comparable {

    String name;
    int roll;

    Student1(String name, int roll){
        this.name=name;
        this.roll= roll;
    }

    @Override
    public int compareTo(Object o) {
        Student1 s=(Student1)o;
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
        return "Student1 [name=" + name + ", roll=" + roll + "]";
    }

    
    
}

class MyComparator implements Comparator{

@Override
	public int compare(Object o1, Object o2) {
        Student1 st1= (Student1)o1;
        Student1 st2= (Student1)o2;
		return st2.name.compareTo(st1.name);
    }
}

