/*Write a Java program that takes two numbers as input and display the product of two numbers. 
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125 */
import java.util.Scanner;
class Product{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //System.out.println(25*5);
        System.out.println("Input first number:");
        int num1 = in.nextInt();
        System.out.println("Input second number:");
        int num2 = in.nextInt();
        System.out.println( "product is : "+ num1 * num2);
    }
}
//import java.util.scanner;
//scanner in = new scanner(System.in);
//int num = in.nextInt();
