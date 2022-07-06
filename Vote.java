import java.util.Scanner;
class Vote{
    public static void main(String[] args){
                       Scanner in = new Scanner(System.in);
            System.out.println("ENTER THE AGE:");
            int n = in.nextInt();
            if(n>=18){
            System.out.println("eligible for voting");
            }
            else{
                System.out.println("non eliigble for voting");
            }
    }
}