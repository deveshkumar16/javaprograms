/*write a Java program that accepts three integers from the user and
return true if the second number is greater than first number and third
number is greater than second number. If "abc" is true second number
does not need to be greater than first number. Go to the editor
Sample Output:
Input the first number : 5
Input the second number: 10
Input the third number : 15
The result is: true */
import java.util.Scanner;
class Abc{
                public static void main(String[] args){
                 Scanner in = new Scanner(System.in);
                 System.out.println("ENTER FIRST NUMBER:");
                 int a =in.nextInt();
                 System.out.println("ENTER SECOND NUMBER:");
                 int b =in.nextInt();
                 System.out.println("ENTER THIRD NUMBER:");
                 int c =in.nextInt();
                 if(a<b)
                 {
                     if(b<c){
                        System.out.println("TRUE");
                 }
                }
                 else{
                    System.out.println("FALSE");
                 }


                }
}