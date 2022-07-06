/*write a Java program that accepts three integers from the user and
return true if two or more of them (integers ) have the same rightmost
digit. The integers are non-negative. */

import java.util.Scanner;
class RightMostDigit{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
System.out.println("ENTER THE FIRST NUMBER:");
int a = in.nextInt();
System.out.println("ENTER THE SECOND NUMBER:");
int b = in.nextInt();
System.out.println("ENTER THE THIRD NUMBER:");
int c = in.nextInt();
if(a%10==b%10)
{
    System.out.println("TRUE");
}
else if(b%10==c%10)
{
    System.out.println("TRUE");
}
else if(a%10==c%10)
{
    System.out.println("TRUE");
}
else{
    System.out.println("FALSE");
}


}
}