import java .util.Scanner;
public class IT24100580Lab7Q1B{
   public static void main (String []args){
       Scanner mykey = new Scanner(System.in);

       for (int stu =1; stu<=3; stu++) {                         
           int[]marks = new int[4];
           int total = 0;

           System.out.println("Student " + stu );
           System.out.print("Enter marks :");
           String[] input = mykey.nextLine().split(" ");

           for (int i = 0; i < 4; i++) {
               marks[i] = Integer.parseInt(input[i]);
               total += marks[i];

           }
           double average = total / 4.0;
           System.out.println("Average is : " + stu + ": " + average);

           if (average >= 75 && average <= 100) {
               System.out.println(" Overall Grade is: Distinction");
               
           } else if (average >= 50 && average < 75) {
               System.out.println("Overall Grade is: Credit");      
               
           } else if (average >= 0 && average < 50) {
               System.out.println("Overall Grade is: Fail");
               
           } else {
               System.out.println("Invalid marks entered.");
           }
           System.out.println();

       }
   }
}