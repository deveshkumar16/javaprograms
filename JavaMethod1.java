//write a java method to find the smallest among three numbers
import java.util.Scanner;
class JavaMethod1{
    public static int smallestAmongThree(int a,int b,int c){
        if(a<b && a<c){
            System.out.println("A IS SMALLEST");
        }
        else if(a>b && c>b){
            System.out.println("B IS SMALLEST");
        }
        else{
            System.out.println("C IS SMALLEST");
        }
       return 1;
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int call = smallestAmongThree(a,b,c);
            System.out.println(call);
            


        }
    
}