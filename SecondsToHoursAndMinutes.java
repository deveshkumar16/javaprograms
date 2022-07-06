/*. Write a Java program to convert seconds to hour, minute and
seconds. Go to the editor
Sample Output:
Input seconds: 86399
23:59:59
 */
import java.util.Scanner;
 class SecondsToHoursAndMinutes{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
System.out.println("ENTER THE SECONDS TO CONVERT TO HOURS AND MINUTES:");
int seconds = in.nextInt();
int hours,minutes;
hours = seconds/3600;
minutes = seconds/1440;
seconds = seconds/1440;


System.out.println(+hours+ ":" +minutes+ ":" +seconds+ " " );


 }
}