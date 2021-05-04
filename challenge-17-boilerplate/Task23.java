import java.util.*;

class Task23
{
    public static void main(String arg[])
    {
             Scanner scan = new Scanner(System.in);
       int number;
            float total = 0;
    System.out.println("Enter total number of students:");
         number = scan.nextInt();

      String[] studentNames = new String[number];
            int[] studentRollNo = new int[number];

   totalmarks(number,studentNames,studentRollNo,marks[row][col],total);

           float[][] marks = new float[number][5];
 
         for(int i = 0; i < number; i++)
         {
System.out.println("Enter the name of student:");
studentNames[i] = scan.next();

System.out.println("Enter the Roll No of student:");
studentRollNo[i] = scan.nextInt();

System.out.println("Enter the marks for Math:");
marks[i][0]= scan.nextFloat();
System.out.println("Enter the marks for Science:");
marks[i][1]= scan.nextFloat();

System.out.println("Enter the marks for English:");
marks[i][2]= scan.nextFloat();

System.out.println("Enter the marks for Language:");
marks[i][3]= scan.nextFloat();

System.out.println("Enter the marks for Social Studies:");
marks[i][4]= scan.nextFloat();

      }
    }

    public static float totalmarks(int number,String studentNames[],int studentRollNo[],float marks[row][col],float total)
         {
             for(int row=0; row<number; row++)
           {
            total = 0;
        System.out.println(studentRollNo[row] + "   "+ studentNames[row]);

            for(int col=0;col<5;col++)
            {
                total = total + marks[row][col];
             }
           System.out.println("Total Marks: " + total);

               
           }
           return 0.f;
         }
 }

   
    