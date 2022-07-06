/* #pattern questions */

import java.util.Scanner;
class LinePattern{
    public static void main(String[] args){
        int i;
                       Scanner in = new Scanner(System.in);
            System.out.println("ENTER THE NUMBER of star to print:");
            int n = in.nextInt();
            
            for(i=1;i<=n;i++)
            {
                System.out.println("*");
            }
        }
    }