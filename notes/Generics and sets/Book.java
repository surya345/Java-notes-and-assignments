import java.util.HashSet;
class Book 
 {
   int isbnNo;
   String title;
   String author;

   public Book(int isbnNo, String title, String author) 
   {
       this.isbnNo = isbnNo;
       this.title = title;
       this.author = author;
   }

   @Override
   public String toString() {
       return "Book [author=" + author + ", isbnNo=" + isbnNo + ", title=" + title + "]";
   }  
 }
 class HashSetEx
 {
     public static void main(String[] args) 
     {
         Book b1=new Book(101,"Java at Glance","Pranay");
         Book b2=new Book(102,"Java for Beginner","Vikhil");
         Book b3=new Book(103,"Head and First Java","Sagar");

         HashSet<Booket> s=new HashSet<>();
         set.add(b1);
         set.add(b2);
         set.add(b3);

         for(Book b:set)
         {
             System.out.println(b);
         }


         
     }
 }
