/*write a Java program to find the number of values in a given range
divisible by a given value. Go to the editor
For example x = 5, y=20 and p =3, find the number of integers within the
range x..y and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
Sample Output:
5 */
import java.util.Scanner;
class DivisibleByInteger{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER:");
        int x =in.nextInt();
        System.out.println("ENTER SECOND NUMBER:");
        int y =in.nextInt();
        System.out.println("ENTER dividend NUMBER:");
        int p =in.nextInt();
        int i;
        int sum =0;

        System.out.println("the followings are the range numbers divid by p :"  );
        for(i=x;i<=y;i++){
            if(i%p==0)
            {
                
                System.out.println(i);
                sum=sum+i;
            }
            
        }
        System.out.println("sum is:" + sum);
    }
}
       