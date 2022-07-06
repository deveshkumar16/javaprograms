import java.util.Scanner;
class Swap{
    public static void main(String[] args){
         Scanner in = new Scanner(System.in);
         System.out.println("ENTER FIRST NUMBERS");
         int a = in.nextInt();
         System.out.println("ENTER SECOND NUMBERS");
         int b = in.nextInt();
         int swap;

         System.out.println("before swapping:"+a+" "+b+" ");

         a=a+b;
         b=a-b;
         a=a-b;


         System.out.println("after the swapping:"+a+" "+b+" ");
         
    }
}