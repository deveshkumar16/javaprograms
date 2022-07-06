/*Write a Java program that takes three numbers as input to calculate and print the 
average of the numbers.*/
import java.util.Scanner;
class Average{
               public static void main(String[] args){
                 Scanner in = new Scanner(System.in);
                 System.out.println("ENTER FIRST NUMBERS:");
                 int n1= in.nextInt();
                 System.out.println("ENTER FIRST NUMBERS:");
                 int n2= in.nextInt();
                 System.out.println("ENTER FIRST NUMBERS:");
                 int n3= in.nextInt();

                 float average = ((n1+n2+n3)/3);
                 System.out.println("average is :"+average);
                 
               }
}
