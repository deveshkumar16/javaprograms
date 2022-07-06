/*Write a Java program that takes a number as input and prints its multiplication table upto 10.
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80*/

import java.util.Scanner;
 class MultipicationTable{
               public static void main(String[] args){
                   Scanner in = new Scanner(System.in);
                   int i, num;
                   System.out.println("Input a number:");
                    num =in.nextInt();
                   for( i=1;i<=10;i++ ){
                       System.out.println(num*i);
                       
                   } } }