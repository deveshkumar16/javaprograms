import java.util.Scanner;
class Calculator1{
    public static void main(String[] args){
                       Scanner in = new Scanner(System.in);
            System.out.println("ENTER  Two value for add,sub,mul,div,mod NUMBER:");
            int a = in.nextInt();
            int b = in.nextInt();
            int sum,mul,sub;
            double div,mod;
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