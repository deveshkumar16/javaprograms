/* Write a Java program to calculate the modules of two numbers
without using any inbuilt modulus operators. */

//ans.
import java.util.Scanner;
class Exercise3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER FIRST INTEGER(bhajya):");
        int bhajya = in.nextInt();
        System.out.println("ENTER SECOND INTEGER(bhajak):");
        int bhajak = in.nextInt();
        int bhagfal = bhajya/bhajak;
        int rem = bhajya-(bhajak*bhagfal);
        System.out.println(rem);
}
}
