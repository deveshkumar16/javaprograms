import java.util.Scanner;
class Calculator2{
    public static void main(String[] args){
                       Scanner in = new Scanner(System.in);
            System.out.println("ENTER FIRST NUMBER:");
            int a = in.nextInt();
            System.out.println("ENTER SECOND NUMBER:");
            int b = in.nextInt();
            int n,sum,mul,sub;
            double div,mod;
            switch (n) {
                case value 1:
                if(n==sum){
                    sum=a+b;
                    System.out.println(sum);
                }
                    
                    break;
                    case value 2:
                if(n==sub){
                    sub=a-b;
                    System.out.println(sub);
                }
                    
                    break;
            
                default:
                    break;
            }
            sum=a+b;
            sub=a-b;
            mul=a*b;
            div=a/b;
            mod=a%b;
            System.out.println("the sum is:"+sum+" ");
            System.out.println("the sub is:"+sub+" ");
            System.out.println("the mul is:"+mul+" ");
            System.out.println("the div is:"+div+" ");
            System.out.println("the mod is:"+mod+" ");


            
    }
}