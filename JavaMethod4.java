import java.util.Scanner;
class JavaMethod4{
    public static int vote(int n){
        if(n>=18){
            System.out.println("eligible for vote");
        }
       
        else{
            System.out.println("not");

        }
       return 0;
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
        
            int call = vote(n);
            System.out.println(call);
            


        }
    
}