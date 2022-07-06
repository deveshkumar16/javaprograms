/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		for (int i = Integer.parseInt(scan.nextLine()); i > 0; i--) {
    		String[] inputs = scan.nextLine().split(" ");
    		int x = Integer.parseInt(inputs[0]),
    		    y = Integer.parseInt(inputs[1]);
    		     if(x>y){
    		        int result = x-y;
    		         System.out.println(result);
    		     }
            else   {
               int result = y-x;
                System.out.println(result);
            
		}
		scan.close();
	}
}
}
