/*Write a Java program that accepts two integer values from the user
and return the larger values. However if the two values are the same,
return 0 and return the smaller value if the two values have the same
remainder when divided by 6. */

//ans.
import java.util.Scanner;
class Exercise1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER FIRST INTEGER:");
        int a = in.nextInt();
        System.out.println("ENTER SECOND INTEGER:");
        int b = in.nextInt();
    if(a==b)
    {
        System.out.println("return 0");
        
    }
    else if(a%6==b%6){
        if(a>b){
            System.out.println(+b+ " is smallest");
        }
        else{
            System.out.println(+a+ " is smallest");
        }
    }
    else{
        if(a>b){
            System.out.println(+a+ " is largest");
        }
       else {
        System.out.println(+b+ " IS LARGER");
       }
    }
}
}
