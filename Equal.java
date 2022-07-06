/*Write a Java program that accepts four integer from the user and
prints equal if all four are equal, and not equal otherwise */
import java.util.Scanner;

class Equal{
           public static void main(String[] args){
                 Scanner in = new Scanner(System.in);
                 System.out.println("Input first number:");
                 int a = in.nextInt();
                 System.out.println("Input second number:");
                 int b = in.nextInt();
                 System.out.println("Input third number:");
                 int c = in.nextInt();
                 System.out.println("Input fourth number:");
                 int d = in.nextInt();
                 if(a==b && b==c && c==d && d==a){
                    System.out.println("ALL ARE EQUAL");
                 }
                 else{
                    System.out.println("ALL ARE  NOT EQUAL");

                 }
                 
           }
}
