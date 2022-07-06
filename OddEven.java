import java.util.Scanner;
class OddEven{
    public static void main(String[] args){
                       Scanner in = new Scanner(System.in);
            System.out.println("ENTER THE NUMBER:");
            int n = in.nextInt();
            if(n%2==0){
            System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
    }
}