import java.util.Scanner;
class BusFare{
    public static void main(String[] args){
                       Scanner in = new Scanner(System.in);
            System.out.println("ENTER THE AGE :");
            int a = in.nextInt();
            if(a>=60 && a<=5){
            System.out.println("BUS RENT / FARE IS FREE");
            }
            else{
                if(a>=6 && a<=17){
                    System.out.println("BUS RENT / FARE IS 100 RUPEES");
                }
                else{
                    
                       
                         System.out.println("BUS RENT / FARE IS 200 RUPEES");
                       
                    }
                }
            
    }
}