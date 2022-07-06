import java.util.Scanner;
class JavaMethod5{
    public static int product(int a , int b){
        
        
        int product = a*b;
        System.out.println(product);
       
       return 0;

    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
           
        
            int call = product( a , b);
            System.out.println(call);
            


        }
    
}