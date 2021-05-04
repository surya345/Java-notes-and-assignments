
import java.util.*;
 
public class calc{
    public static void main(String args[]){
         
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("\n\t\t1.Addition\n\t\t2.Subtraction\n\t\t3.Multiplication\n\t\t4.Division\n\t\t5.Remainder\n\t\t6.Exit");
            System.out.println("\nEnter your choice from above menu:");
            int choice = in.nextInt();
            if(choice == 6){
                    System.exit(0);
            }
            System.out.println("\nEnter value 1:");
            float num1 = in.nextInt();
            System.out.println("\nEnter value 2:");
            float num2 = in. nextInt();
            float output;
            switch(choice){
                case 1: output = num1 + num2;
                    System.out.println("\nAddition of above two numbers is:" + output);
                    break;
                case 2: output = num1 - num2;
                    System.out.println("\nSubtraction of above two numbers is:" + output);
                    break;
                case 3: output = num1 * num2;
                    System.out.println("\nMultiplication of above two numbers is:" + output);
                    break;
                case 4: output = num1 / num2;
                    System.out.println("\nDivision of above two numbers is:" + output);
                    break;
                case 5: output = num1 % num2;
                    System.out.println("\nRemainder for division of above two numbers is:" + output);
                    break;
                }
        }
  }
}