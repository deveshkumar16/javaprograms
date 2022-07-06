import java.util.Scanner;
class JavaMethod3{
    public static int evenOdd(int n){
        if(n%2==0){
            System.out.println("even");
        }
       
        else{
            System.out.println("odd");
        }
       return 0;
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
        
            int call = evenOdd(n);
            System.out.println(call);
            


        }
    
}