class demo{
    public static void main(String[] args) {
    Person[] p=new Person[1];
    p[0]=new Person("john",25);
    for (Person pr: p){
        System.out.println(pr);
    }
    }
}

class Person{
    private String name;
    private int age;


public Person(String name, int age) {
   this.name=name;
   this.age=age;
	}

    public void setName(String name) {
	this.name = name;
}

    public void setAge(int age) {
    	this.age = age;
    }
    @Override
    public String toString() {
    return "{Person name:"+ name + "person age:"+age+ "}";
    }


}


