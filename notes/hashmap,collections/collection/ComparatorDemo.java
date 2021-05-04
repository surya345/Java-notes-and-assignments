import java.util.Comparator;
import java.util.TreeSet;

class ComparatorDemo{
    public static void main(String[] args) {
        
        TreeSet tset= new TreeSet<>();
        tset.add("Pranay");
        tset.add("Kamran");
        tset.add("Devid");
        tset.add("Vikhil");
        tset.add("Yamini");

        System.out.println(tset);
    }


}

class Student implements Comparator {

    String name;

    Student(String name){
        this.name=name;
    }

    @Override
	public int compare(Object o1, Object o2) {
        
        Student s1=(Student) o1;
        Student s2=(Student) o2;
        
		return 0;
	}