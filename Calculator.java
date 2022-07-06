/*Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. 
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5*/

import java.util.Scanner;
import java.util.Scanner;
public class Calculator{
    public  static void main(String[] args){
        Scanner in = new Scanner(System.in);
           System.out.println("enter first number:");
           int num1=in.nextInt();
           System.out.println("enter second number:");
           int num2=in.nextInt();
          int sum=num1+num2;
           System.out.println(sum);
           int sub = num1-num2;
           System.out.println(sub);
           int mul = num1*num2;
           System.out.println(mul);
           int divide = num1/num2;
           System.out.println(divide);
           int mod = num1%num2;
           System.out.println(mod);
           


    }

}