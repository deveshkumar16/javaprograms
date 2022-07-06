//Write a Java program to calculate the sum of two integers and return
// true if the sum is equal to a third integer
import java.util.Scanner;
class EqualToThirdInteger{
    public static void main(String[] args){
                       Scanner in = new Scanner(System.in);
            System.out.println("ENTER THE FIRST NUMBER:");
            int a = in.nextInt();
            System.out.println("ENTER THE SECOND NUMBER:");
            int b = in.nextInt();
            System.out.println("ENTER THE THIRD NUMBER:");
            int c = in.nextInt();
            int sum;
            sum=a+b;
            System.out.println("the sum is :"+sum+" ");
            if(sum==c)
             {
                System.out.println("TRUE");
             }
             else{
                System.out.println(" FALSE");
             }
          
    }
}