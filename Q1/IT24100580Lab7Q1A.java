import java.util.Scanner;
public class IT24100580Lab7Q1A {
    public static void main (String[]args){
        Scanner mykey = new Scanner(System.in);
        int[]marks = new int[4];
        int total=0;
        System.out.println("Enter marks for four subject :");

        for (int i =0;i<4;i++){
            System.out.print("Enter marks for Mark" +" " +(i +1)+" "+ ":");
            marks[i] = mykey.nextInt();
            total+= marks[i];

        }
        System.out.println(" ");
        double average = total/4.0;
        System.out.println("Average Marks:"+ average);

        if (average >= 75 && average <=100) {
            System.out.println("Grade:Distinction");
        } else if (average >= 50 && average< 75) {
            System.out.println("Grade:Credit");
        } else if (average >= 0 && average < 50) {
            System.out.println("Grade:Fail");
        }else {
            System.out.println("Invalid marks entered.");
         }
        