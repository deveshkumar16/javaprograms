/* Write a Java program that accepts two integer values between 25 to
75 and return true if there is a common digit in both numbers. */

//ans.
import java.util.Scanner;
class Exercise2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER FIRST INTEGER value between 25 to 75:");
        int a = in.nextInt();
        System.out.println("ENTER SECOND INTEGER value between 25 to 75:");
        int b = in.nextInt();
        if(a==b){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    
}
}
