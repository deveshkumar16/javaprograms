/* 1. Write a Program to print the right triangle star pattern.

*
**
***
****
*****  */

import java.util.Scanner;

class Pattern1{
           public static void main(String[] args){
                 Scanner in = new Scanner(System.in);
                 System.out.println("Input how many line prints:");
                 int n = in.nextInt();
                 for(int i=1;i<=n;i++){
                    for(int j=i;j<=n;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                 }
                
           }
}
