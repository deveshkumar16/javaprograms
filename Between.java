/*Write a Java program that accepts two double variables and test if
both strictly between 0 and 1 and false otherwise. */
import java.util.Scanner;
class Between{
               public static void main(String[] args)
               {
                Scanner in = new Scanner(System.in);
                System.out.println("INPUT FIRST NUMBER");
                double a = in.nextInt();
                System.out.println("INPUT SECOND NUMBER");
                double b = in.nextInt();
                if(a<=1 && a>=0 && b<=0 && b<=1)
                {
                    System.out.println("TRUE");
                    
                }
                else{
                    System.out.println("FALSE");
                }



               }

}