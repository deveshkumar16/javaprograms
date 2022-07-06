import java.util.Scanner;
class Year {
      public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            System.out.println("ENTER YEAR:");
            int year=in.nextInt();
            if(year%400==0){
                if(year%4==0)
                
                {
                    System.out.println("year is leap");
                }
                
            }
            else 
            {
                System.out.println("YEAR IS NOT LEAP");
            }


      }
}