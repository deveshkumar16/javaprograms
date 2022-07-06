/*Write a Program to print mirrored right triangle star pattern. */
import java.util.Scanner;
public class p3 {

 public static void main(String[] args) {
    
  Scanner s=new Scanner(System.in);

    System.out.println("Enter the row size:");

    int row_size=s.nextInt();

    for(int out=1;out<=row_size;out++)

    {
     for(int in=1;in<=row_size-out;in++)

      System.out.printf(" ");

     for(int p=1;p<=out;p++)

      System.out.print("*");

           System.out.println();
    }
       s.close();
   }
}