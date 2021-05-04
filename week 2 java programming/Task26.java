import java.util.Scanner;
class Task26
{          
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        inform f=new inform();
        f.setNum();
       int n= f.getNum();
        inform[] f1=new inform[n];
    
        for(int i=0;i<n;i++)
        {
            
            f.setfirst();f.setlast();f.setphone(); f.setvillage();f.setage();
            String n1= "CUST00"+(i+1);
            f.setid(n1);
            f1[i]=new inform(f.getfirst(),f.getlast(),f.getphone(),f.getvillage(),f.getage(),f.getid());   
        }
            System.out.println("enter the last name to display particular person details : ");
            String lName=obj.next();
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("name of customer\tphone num\tvillage\t\tage\tcustomer id");
            System.out.println("-----------------------------------------------------------------------------");

            for(int i=0;i<n;i++)
            {
                if(lName.equals(f1[i].getlast()))
                {
                    System.out.println(f1[i]); 
                }    
                  
            }  
        System.out.println("enter the village or taluk name to display a list of customers belonging to a particular taluk or village : ");
            String tVillage=obj.next();
            System.out.println("--------------------------------------------------");
            System.out.println("village or taluk\tname of customer");
            System.out.println("--------------------------------------------------");

            for(int i=0;i<n;i++)
            { 
                if(tVillage.equals(f1[i].getvillage())){
                System.out.println(f1[i].getvillage()+"\t\t\t"+f1[i].getfirst()+" "+f1[i].getlast());
            }
            
        }  
                  
    }
}
         
class inform

{
    private String first;    
    private String last;    
    private String phone;    
    private String village;  
    private int age,n;    
    private String id;  

    Scanner sc=new Scanner(System.in);


    inform(String first,String last,String phone,String village,int age,String id)
   {
       this.first=first;
       this.last=last;
       this.phone=phone;
       this.village=village;
       this.id=id;
       this.age=age;
   }
   inform()
   {
       this.first=first;
       this.last=last;
       this.phone=phone;
       this.village=village;
       this.id=id;
       this.age=age;
   }
   @Override
   public String toString() {
       return first +' '+ last + "\t\t" + phone +"\t" + village +"\t\t"
               + age+ "\t" + id ;
   }

public int getNum() {
    return n;
}

public void setNum() 
{
    
    System.out.println("Enter no of people : ");
    this.n=sc.nextInt();
    

}

public String getfirst() {
return first;

}
public void setfirst() {

    
System.out.println("Enter first name : ");
this.first=sc.next();

}

public String getlast() {
return last;
}

public void setlast() {
System.out.println("Enter last name : ");
this.last=sc.next();

}

public String getphone() {

    
return phone;

}
public void setphone() {

    
System.out.println("Enter 10 digit phone num: ");
phone=sc.next();
if(phone.length()==10)
            {
                this.phone=phone;
            }
            else
            {
                System.out.println("entered phone num is incorrect.");
                setphone();
            }

}

public String getvillage() {
return village;
}

public void setvillage() {
System.out.println("Enter village name: ");
this.village=sc.next();

}

public String getid() {
return id;

}
public void setid(String n1) {
this.id=n1;

}

public int getage() {
return age;
}

public void setage() 
{
    System.out.println("enter age: ");
this.age=sc.nextInt();


}
}
