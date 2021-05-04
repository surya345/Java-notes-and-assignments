import java.util.*;
import java.util.Scanner;
class Task24{
  static  Double[] maths; 
  static Double[] Science;
  static Double[] English;
  static Double[] Language;
  static Double[] Social;
  static int i,k=0,n;
  static Double[] avgmarks;
  static  Double[] Tot_marks;

  public static final Double passmark=35.0;
     public static double Totalmarks(double Tot_marks[]){
      for(int i=0;i<=n;i++){
     Tot_marks[i]=(maths[i] + English[i] +Social[i]+Science[i]+Language[i]);}
     return Tot_marks[i];
    }
    
    public static double Averagemarks(double avgmarks[]){
    
      char grade=' ';
      for(int i=0;i<=n;i++){
        avgmarks[i]= (Tot_marks[i]/5);
        if(avgmarks[i]>=90){
          grade='A';
      }else if(avgmarks[i]>=80 && avgmarks[i]<90){
          grade='B';
      }else if(avgmarks[i]>=70 && avgmarks[i]<80){
          grade='C';
      }else if(avgmarks[i]>=60 && avgmarks[i]<70){
          grade='D';
      }else if(avgmarks[i]>=50 && avgmarks[i]<60){
          grade='E';
      }else if(avgmarks[i]<50){
          grade='F';
      } 
      System.out.println(grade);  
      }
      return avgmarks[i];
  }
  public static void failPass(int n, double[] maths, double[] Science, double[] English, double[] Language,
    double[] Social, String[] name, int[] roll){
    int fail = 0,pass = 0;
    for(int i=0; i < n; i++)
    {
        if(maths[i] < 35 || Science[i] < 35 || English[i] < 35 || Language[i] < 35 || Social[i] < 35)
        {
            fail += 1;
        }
        else
        {
            pass += 1;
        }}
        System.out.println("Number of students who pass=" +pass+ "and number of students who fails=" +fail );
    }
  public void status(){
    if(passmark>=35){
      System.out.println("student is pass");
    }
    else{
      System.out.println("student is fail");
    }
  }
  public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the total number of students");
         n=scan.nextInt();
        String[] name=new String[n];
        int[] rollno=new int[n];
        maths = new Double[n];
        Science= new Double[n];
        English= new  Double[n];
        Language=new Double[n];
        Social = new Double[n];
        Tot_marks=new Double[n];
        avgmarks=new Double[n];
     for(i=0;i<n;i++){
     System.out.println("Enter student:("+(i+1)+")rollno,name,maths,Science,English,Language,Social");
      rollno[i]=scan.nextInt();
      name[i]=scan.next();
      maths[i]=scan.nextDouble();
      Science[i]=scan.nextDouble();
      Language[i]=scan.nextDouble();
      English[i]=scan.nextDouble();
      Social[i]=scan.nextDouble();
    }
System.out.println("Name="+name+ "rollno="+rollno);
System.out.println("Subject Names= Maths Science Language English Social" +maths[i]+ Science[i]+Language[i]+ Social[i]+English[i]);
System.out.println(avgmarks[i]+Tot_marks[i]);
  }
  
}