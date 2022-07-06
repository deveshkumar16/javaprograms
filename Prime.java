/*Write a Java program to compute the sum of the first 100 prime
number */
//ans.
import java.util.Scanner;
class Prime
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER HOW MANY PRIME NUMBERS YOU WANT TO SUM:");
        int n=in.nextInt();
        int prime = (n*n+n)/2;
        System.out.println("the sum is"+prime+ " ");

    }
}